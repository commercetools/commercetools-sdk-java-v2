
package com.commercetools.history.defaultconfig;

import io.vrap.rmf.base.client.ServiceRegionConfig;

public enum ServiceRegion implements ServiceRegionConfig {

    GCP_EUROPE_WEST1(new RegionHosts("https://history.europe-west1.gcp.commercetools.com/",
        "https://auth.europe-west1.gcp.commercetools.com")),
    GCP_US_CENTRAL1(new RegionHosts("https://history.us-central1.gcp.commercetools.com/",
        "https://auth.us-central1.gcp.commercetools.com")),
    AWS_US_EAST_2(new RegionHosts("https://history.us-east-2.aws.commercetools.com/",
        "https://auth.us-east-2.aws.commercetools.com")),
    AWS_EU_CENTRAL_1(new RegionHosts("https://history.eu-central-1.aws.commercetools.com/",
        "https://auth.eu-central-1.aws.commercetools.com")),
    GCP_AUSTRALIA_SOUTHEAST1(new RegionHosts("https://history.australia-southeast1.gcp.commercetools.com/",
        "https://auth.australia-southeast1.gcp.commercetools.com")),
    AWS_CN_NORTHWEST_1(new RegionHosts("https://history.cn-northwest-1.aws.commercetools.cn/",
        "https://auth.cn-northwest-1.aws.commercetools.cn/")),;

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
