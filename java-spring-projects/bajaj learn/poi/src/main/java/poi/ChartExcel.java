package poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xddf.usermodel.chart.AxisPosition;
import org.apache.poi.xddf.usermodel.chart.ChartTypes;
import org.apache.poi.xddf.usermodel.chart.XDDFCategoryAxis;
import org.apache.poi.xddf.usermodel.chart.XDDFChartData;
import org.apache.poi.xddf.usermodel.chart.XDDFDataSource;
import org.apache.poi.xddf.usermodel.chart.XDDFDataSourcesFactory;
import org.apache.poi.xddf.usermodel.chart.XDDFNumericalDataSource;
import org.apache.poi.xddf.usermodel.chart.XDDFValueAxis;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ChartExcel {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("employee.xlsx");
        XSSFWorkbook wb = (XSSFWorkbook) WorkbookFactory.create(fis);
        XSSFSheet sheet = wb.getSheetAt(0);

        // Create drawing (for chart)
        XSSFDrawing drawing = sheet.createDrawingPatriarch();

        // Position of chart on sheet
        XSSFClientAnchor anchor = drawing.createAnchor(0, 0, 0, 0, 5, 1, 15, 20);

        // Create chart
        XSSFChart chart = drawing.createChart(anchor);
        chart.setTitleText("Employee Salary Chart");
        chart.setTitleOverlay(false);

        // Axis
        XDDFCategoryAxis bottomAxis = chart.createCategoryAxis(AxisPosition.BOTTOM);
        bottomAxis.setTitle("Employee Name");

        XDDFValueAxis leftAxis = chart.createValueAxis(AxisPosition.LEFT);
        leftAxis.setTitle("Salary");

        // Data range (Assuming: Column A = Name, Column C = Salary)
        XDDFDataSource<String> names =
                XDDFDataSourcesFactory.fromStringCellRange(sheet, new CellRangeAddress(1, 5, 1, 1));

        XDDFNumericalDataSource<Double> salaries =
                XDDFDataSourcesFactory.fromNumericCellRange(sheet, new CellRangeAddress(1, 5, 2, 2));

        // Create chart data
        XDDFChartData data = chart.createData(ChartTypes.BAR, bottomAxis, leftAxis);

        XDDFChartData.Series series = data.addSeries(names, salaries);
        series.setTitle("Salary", null);

        chart.plot(data);

        // Write back to same file
        FileOutputStream fos = new FileOutputStream("employee.xlsx");
        wb.write(fos);

        wb.close();
        fis.close();
        fos.close();

        System.out.println("Chart created successfully!");
    }
}