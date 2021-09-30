
package com.commercetools.ml.defaultconfig;

import io.vrap.rmf.base.client.ServiceRegionConfig;

public enum ServiceRegion implements ServiceRegionConfig {

    GCP_EUROPE(new RegionHosts("https://ml-eu.europe-west1.gcp.commercetools.com",
        "https://auth.europe-west1.gcp.commercetools.com")),
    GCP_US(new RegionHosts("https://ml-us.europe-west1.gcp.commercetools.com",
        "https://auth.us-central1.gcp.commercetools.com")),

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

    @Override
    public String getApiUrl() {
        return regionHosts.apiUrl;
    }

    @Override
    public String getAuthUrl() {
        return regionHosts.authUrl;
    }
}
