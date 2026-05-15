package com.training.org;

public class Certification {
    private int certId;
    private String certName;
    private String provider;

    public Certification() {}

    public Certification(int certId, String certName, String provider) {
        this.certId = certId;
        this.certName = certName;
        this.provider = provider;
    }

    public int getCertId() {
        return certId;
    }

    public void setCertId(int certId) {
        this.certId = certId;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Certification [certId=" + certId + ", certName=" + certName + ", provider=" + provider + "]";
    }
}