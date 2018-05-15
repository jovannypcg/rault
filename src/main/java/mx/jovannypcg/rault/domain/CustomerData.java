package mx.jovannypcg.rault.domain;

public class CustomerData {
    private String cert;

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    @Override
    public String toString() {
        return String.format("Cert: %s", cert);
    }
}
