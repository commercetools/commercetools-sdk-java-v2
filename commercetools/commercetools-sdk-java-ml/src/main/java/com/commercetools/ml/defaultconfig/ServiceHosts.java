package com.commercetools.ml.defaultconfig;

public enum ServiceHosts {

    GCP_EUROPE(new ServiceHost(
            "https://ml-eu.europe-west1.gcp.commercetools.com",
            "https://auth.eu_west1.gcp.commercetools.com"
    )),
    GCP_US(new ServiceHost(
            "https://ml-us.europe-west1.gcp.commercetools.com",
            "https://auth.us-central1.gcp.commercetools.com"
    )),

    ;

    public static class ServiceHost {
        private final String apiUrl;
        private final String authUrl;

        private ServiceHost(String apiUrl, String authUrl) {
            this.apiUrl = apiUrl;
            this.authUrl = authUrl;
        }
    }

    private final ServiceHost serviceHost;

    ServiceHosts(ServiceHost serviceHost) {
        this.serviceHost = serviceHost;
    }

    public String getApiUrl() {
        return serviceHost.apiUrl;
    }

    public String getAuthUrl() {
        return serviceHost.authUrl;
    }

    public String getOAuthTokenUrl() {
        return serviceHost.authUrl + "/oauth/token";
    }
}
