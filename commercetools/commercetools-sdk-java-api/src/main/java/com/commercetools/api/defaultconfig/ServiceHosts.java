package com.commercetools.api.defaultconfig;

public enum ServiceHosts {

    GCP_EUROPE_WEST1(new ServiceHost(
            "https://api.eu_west1.gcp.commercetools.com",
            "https://auth.eu_west1.gcp.commercetools.com"
    )),
    GCP_US_CENTRAL1(new ServiceHost(
            "https://api.us-central1.gcp.commercetools.com",
            "https://auth.us-central1.gcp.commercetools.com"
    )),
    AWS_US_EAST_2(new ServiceHost(
            "https://api.us-east-2.aws.commercetools.com",
            "https://auth.us-east-2.aws.commercetools.com"
    )),
    AWS_EU_CENTRAL_1(new ServiceHost(
            "https://api.eu-central-1.aws.commercetools.com",
            "https://auth.eu-central-1.aws.commercetools.com"
    )),
    GCP_AUSTRALIA_SOUTHEAST1(new ServiceHost(
            "https://api.australia-southeast1.gcp.commercetools.com",
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
