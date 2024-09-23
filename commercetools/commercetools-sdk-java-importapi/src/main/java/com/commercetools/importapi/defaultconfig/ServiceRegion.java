
package com.commercetools.importapi.defaultconfig;

import io.vrap.rmf.base.client.ServiceRegionConfig;

public enum ServiceRegion implements ServiceRegionConfig {

    GCP_EUROPE_WEST1(new RegionHosts("https://import.europe-west1.gcp.commercetools.com/",
        "https://auth.europe-west1.gcp.commercetools.com")),
    GCP_US_CENTRAL1(new RegionHosts("https://import.us-central1.gcp.commercetools.com/",
        "https://auth.us-central1.gcp.commercetools.com")),
    GCP_AUSTRALIA_SOUTHEAST1(new RegionHosts("https://import.australia-southeast1.gcp.commercetools.com/",
        "https://auth.australia-southeast1.gcp.commercetools.com")),
    AWS_US_EAST_2(new RegionHosts("https://import.us-east-2.aws.commercetools.com/",
        "https://auth.us-east-2.aws.commercetools.com")),
    AWS_EU_CENTRAL_1(new RegionHosts("https://import.eu-central-1.aws.commercetools.com/",
        "https://auth.eu-central-1.aws.commercetools.com")),
    AZURE_EASTUS(new RegionHosts("https://import.eastus.azure.commercetools.com/",
        "https://auth.eastus.azure.commercetools.com")),;

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
