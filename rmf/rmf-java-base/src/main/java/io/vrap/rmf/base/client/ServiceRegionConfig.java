package io.vrap.rmf.base.client;

public interface ServiceRegionConfig {

    /**
     * @return API base URL
     */
    public String getApiUrl();

    /**
     * @return auth base URL
     */
    public String getAuthUrl();

    /**
     * @return URL for requesting client credentials flow access token
     */
    public default String getOAuthTokenUrl() {
        return getAuthUrl() + "/oauth/token";
    }

    /**
     * @param projectKey
     * @return URL for requesting anonymous flow access token
     */
    public default String getAnonymousFlowTokenURL(final String projectKey) {
        return getAuthUrl() + "/oauth/" + projectKey + "/anonymous/token";
    }

    /**
     * @param projectKey
     * @return URL for requesting password flow access token
     */
    public default String getPasswordFlowTokenURL(final String projectKey) {
        return getAuthUrl() + "/oauth/" + projectKey + "/customers/token";
    }

    /**
     * @param projectKey
     * @param storeKey
     * @return URL for requesting in store password flow access token
     */
    public default String getInstorePasswordFlowTokenURL(final String projectKey, final String storeKey) {
        return getAuthUrl() + "/oauth/" + projectKey + "/in-store/key=" + storeKey + "/customers/token";
    }
}
