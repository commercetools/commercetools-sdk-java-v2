package com.commercetools.importapi.defaultconfig;

public enum ServiceHosts {

    GCP_EUROPE_WEST1(new ServiceHost(
            "https://import.eu_west1.gcp.commercetools.com",
            "https://auth.eu_west1.gcp.commercetools.com"
    )),
    GCP_US_CENTRAL1(new ServiceHost(
            "https://import.us-central1.gcp.commercetools.com",
            "https://auth.us-central1.gcp.commercetools.com"
    )),
    GCP_AUSTRALIA_SOUTHEAST1(new ServiceHost(
            "https://import.australia-southeast1.gcp.commercetools.com",
            "https://auth.australia-southeast1.gcp.commercetools.com"
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
