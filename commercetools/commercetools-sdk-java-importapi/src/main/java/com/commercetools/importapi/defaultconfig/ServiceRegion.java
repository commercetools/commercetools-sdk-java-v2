package com.commercetools.importapi.defaultconfig;

public enum ServiceRegion {

    GCP_EUROPE_WEST1(new RegionHosts(
            "https://import.europe-west1.gcp.commercetools.com",
            "https://auth.europe-west1.gcp.commercetools.com"
    )),
    GCP_US_CENTRAL1(new RegionHosts(
            "https://import.us-central1.gcp.commercetools.com",
            "https://auth.us-central1.gcp.commercetools.com"
    )),
    GCP_AUSTRALIA_SOUTHEAST1(new RegionHosts(
            "https://import.australia-southeast1.gcp.commercetools.com",
            "https://auth.australia-southeast1.gcp.commercetools.com"
    )),
    ;

    public static class RegionHosts {
        private final String apiUrl;
        private final String authUrl;

        private RegionHosts(String apiUrl, String authUrl) {
            this.apiUrl = apiUrl;
            this.authUrl = authUrl;
        }
    }

    private final RegionHosts regionHosts;

    ServiceRegion(RegionHosts regionHosts) {
        this.regionHosts = regionHosts;
    }

    public String getApiUrl() {
        return regionHosts.apiUrl;
    }

    public String getAuthUrl() {
        return regionHosts.authUrl;
    }

    public String getOAuthTokenUrl() {
        return regionHosts.authUrl + "/oauth/token";
    }
}
