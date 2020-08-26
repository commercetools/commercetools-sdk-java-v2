package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String customerId;
    

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey,final String customerId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.customerId = customerId;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdGet(apiHttpClient, projectKey, storeKey, customerId);
    }

}
