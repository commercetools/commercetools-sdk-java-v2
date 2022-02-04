
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyGet get() {
        return new ByProjectKeyGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyPost post(com.commercetools.api.models.project.ProjectUpdate projectUpdate) {
        return new ByProjectKeyPost(apiHttpClient, projectKey, projectUpdate);
    }

    public ByProjectKeyCategoriesRequestBuilder categories() {
        return new ByProjectKeyCategoriesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCartsRequestBuilder carts() {
        return new ByProjectKeyCartsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCartDiscountsRequestBuilder cartDiscounts() {
        return new ByProjectKeyCartDiscountsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyChannelsRequestBuilder channels() {
        return new ByProjectKeyChannelsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersRequestBuilder customers() {
        return new ByProjectKeyCustomersRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomerGroupsRequestBuilder customerGroups() {
        return new ByProjectKeyCustomerGroupsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomObjectsRequestBuilder customObjects() {
        return new ByProjectKeyCustomObjectsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyDiscountCodesRequestBuilder discountCodes() {
        return new ByProjectKeyDiscountCodesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyGraphqlRequestBuilder graphql() {
        return new ByProjectKeyGraphqlRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyInventoryRequestBuilder inventory() {
        return new ByProjectKeyInventoryRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyLoginRequestBuilder login() {
        return new ByProjectKeyLoginRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMessagesRequestBuilder messages() {
        return new ByProjectKeyMessagesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyOrdersRequestBuilder orders() {
        return new ByProjectKeyOrdersRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyPaymentsRequestBuilder payments() {
        return new ByProjectKeyPaymentsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductsRequestBuilder products() {
        return new ByProjectKeyProductsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductDiscountsRequestBuilder productDiscounts() {
        return new ByProjectKeyProductDiscountsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductProjectionsRequestBuilder productProjections() {
        return new ByProjectKeyProductProjectionsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductSelectionsRequestBuilder productSelections() {
        return new ByProjectKeyProductSelectionsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductTypesRequestBuilder productTypes() {
        return new ByProjectKeyProductTypesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyReviewsRequestBuilder reviews() {
        return new ByProjectKeyReviewsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsRequestBuilder shippingMethods() {
        return new ByProjectKeyShippingMethodsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyShoppingListsRequestBuilder shoppingLists() {
        return new ByProjectKeyShoppingListsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyStatesRequestBuilder states() {
        return new ByProjectKeyStatesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeySubscriptionsRequestBuilder subscriptions() {
        return new ByProjectKeySubscriptionsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyTaxCategoriesRequestBuilder taxCategories() {
        return new ByProjectKeyTaxCategoriesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyTypesRequestBuilder types() {
        return new ByProjectKeyTypesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyZonesRequestBuilder zones() {
        return new ByProjectKeyZonesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeRequestBuilder me() {
        return new ByProjectKeyMeRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyExtensionsRequestBuilder extensions() {
        return new ByProjectKeyExtensionsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyApiClientsRequestBuilder apiClients() {
        return new ByProjectKeyApiClientsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyStoresRequestBuilder stores() {
        return new ByProjectKeyStoresRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyRequestBuilder inStoreKeyWithStoreKeyValue(String storeKey) {
        return new ByProjectKeyInStoreKeyByStoreKeyRequestBuilder(apiHttpClient, projectKey, storeKey);
    }
}
