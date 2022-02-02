
package com.commercetools.api.client;

import java.io.Closeable;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.SerializerOnlyApiHttpClient;

/**
 * Project scoped API root
 */
public class ProjectApiRoot implements Closeable {
    private final String projectKey;
    private final ApiHttpClient apiHttpClient;

    private ProjectApiRoot(final String projectKey, final ApiHttpClient apiHttpClient) {
        this.projectKey = projectKey;
        this.apiHttpClient = apiHttpClient;
    }

    public static ProjectApiRoot of(final String projectKey) {
        return new ProjectApiRoot(projectKey, SerializerOnlyApiHttpClient.of());
    }

    public static ProjectApiRoot fromClient(final String projectKey, final ApiHttpClient apiHttpClient) {
        return new ProjectApiRoot(projectKey, apiHttpClient);
    }

    public ByProjectKeyRequestBuilder with() {
        return ApiRoot.fromClient(apiHttpClient).withProjectKey(projectKey);
    }

    public ByProjectKeyRequestBuilder withProjectKey(final String projectKey) {
        return ApiRoot.fromClient(apiHttpClient).withProjectKey(projectKey);
    }

    public ByProjectKeyGet get() {
        return with().get();
    }

    public ByProjectKeyPost post(com.commercetools.api.models.project.ProjectUpdate projectUpdate) {
        return with().post(projectUpdate);
    }

    public ByProjectKeyCategoriesRequestBuilder categories() {
        return with().categories();
    }

    public ByProjectKeyCartsRequestBuilder carts() {
        return with().carts();
    }

    public ByProjectKeyCartDiscountsRequestBuilder cartDiscounts() {
        return with().cartDiscounts();
    }

    public ByProjectKeyChannelsRequestBuilder channels() {
        return with().channels();
    }

    public ByProjectKeyCustomersRequestBuilder customers() {
        return with().customers();
    }

    public ByProjectKeyCustomerGroupsRequestBuilder customerGroups() {
        return with().customerGroups();
    }

    public ByProjectKeyCustomObjectsRequestBuilder customObjects() {
        return with().customObjects();
    }

    public ByProjectKeyDiscountCodesRequestBuilder discountCodes() {
        return with().discountCodes();
    }

    public ByProjectKeyGraphqlRequestBuilder graphql() {
        return with().graphql();
    }

    public ByProjectKeyInventoryRequestBuilder inventory() {
        return with().inventory();
    }

    public ByProjectKeyLoginRequestBuilder login() {
        return with().login();
    }

    public ByProjectKeyMessagesRequestBuilder messages() {
        return with().messages();
    }

    public ByProjectKeyOrdersRequestBuilder orders() {
        return with().orders();
    }

    public ByProjectKeyPaymentsRequestBuilder payments() {
        return with().payments();
    }

    public ByProjectKeyProductsRequestBuilder products() {
        return with().products();
    }

    public ByProjectKeyProductDiscountsRequestBuilder productDiscounts() {
        return with().productDiscounts();
    }

    public ByProjectKeyProductProjectionsRequestBuilder productProjections() {
        return with().productProjections();
    }

    public ByProjectKeyProductSelectionsRequestBuilder productSelections() {
        return with().productSelections();
    }

    public ByProjectKeyProductTypesRequestBuilder productTypes() {
        return with().productTypes();
    }

    public ByProjectKeyReviewsRequestBuilder reviews() {
        return with().reviews();
    }

    public ByProjectKeyShippingMethodsRequestBuilder shippingMethods() {
        return with().shippingMethods();
    }

    public ByProjectKeyShoppingListsRequestBuilder shoppingLists() {
        return with().shoppingLists();
    }

    public ByProjectKeyStatesRequestBuilder states() {
        return with().states();
    }

    public ByProjectKeySubscriptionsRequestBuilder subscriptions() {
        return with().subscriptions();
    }

    public ByProjectKeyTaxCategoriesRequestBuilder taxCategories() {
        return with().taxCategories();
    }

    public ByProjectKeyTypesRequestBuilder types() {
        return with().types();
    }

    public ByProjectKeyZonesRequestBuilder zones() {
        return with().zones();
    }

    public ByProjectKeyMeRequestBuilder me() {
        return with().me();
    }

    public ByProjectKeyExtensionsRequestBuilder extensions() {
        return with().extensions();
    }

    public ByProjectKeyApiClientsRequestBuilder apiClients() {
        return with().apiClients();
    }

    public ByProjectKeyStoresRequestBuilder stores() {
        return with().stores();
    }

    public ByProjectKeyInStoreKeyByStoreKeyRequestBuilder inStore(String storeKey) {
        return with().inStoreKeyWithStoreKeyValue(storeKey);
    }

    @Override
    public void close() {
        if (apiHttpClient == null) {
            return;
        }
        try {
            apiHttpClient.close();
        }
        catch (final Throwable ignored) {
        }
    }
}
