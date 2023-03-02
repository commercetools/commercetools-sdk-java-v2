
package com.commercetools.api.client;

import java.io.Closeable;
import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.Context;
import io.vrap.rmf.base.client.ContextApiHttpClient;
import io.vrap.rmf.base.client.SerializerOnlyApiHttpClient;

/**
 * Project scoped API root
 */
public class ProjectApiRoot implements Closeable, ProjectScopedApiRoot {
    private final String projectKey;
    private final ApiHttpClient apiHttpClient;

    private ProjectApiRoot(final String projectKey, final ApiHttpClient apiHttpClient) {
        this.projectKey = projectKey;
        this.apiHttpClient = apiHttpClient;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public ApiHttpClient getApiHttpClient() {
        return apiHttpClient;
    }

    public static ProjectApiRoot of(final String projectKey) {
        return new ProjectApiRoot(projectKey, SerializerOnlyApiHttpClient.of());
    }

    public static ProjectApiRoot fromClient(final String projectKey, final ApiHttpClient apiHttpClient) {
        return new ProjectApiRoot(projectKey, apiHttpClient);
    }

    public static ProjectApiRoot withContext(final String projectKey, final ApiHttpClient apiHttpClient,
            final Context context) {
        return new ProjectApiRoot(projectKey, ContextApiHttpClient.of(apiHttpClient, context));
    }

    public static ProjectApiRoot withContext(final ProjectApiRoot projectApiRoot, final Context context) {
        return new ProjectApiRoot(projectApiRoot.projectKey,
            ContextApiHttpClient.of(projectApiRoot.apiHttpClient, context));
    }

    @Override
    public ByProjectKeyRequestBuilder with() {
        return ApiRoot.fromClient(apiHttpClient).withProjectKey(projectKey);
    }

    public ByProjectKeyRequestBuilder withProjectKey(final String projectKey) {
        return ApiRoot.fromClient(apiHttpClient).withProjectKey(projectKey);
    }

    @Override
    public ByProjectKeyGet get() {
        return with().get();
    }

    @Override
    public ByProjectKeyPost post(com.commercetools.api.models.project.ProjectUpdate projectUpdate) {
        return with().post(projectUpdate);
    }

    @Override
    public ByProjectKeyCategoriesRequestBuilder categories() {
        return with().categories();
    }

    @Override
    public ByProjectKeyCartsRequestBuilder carts() {
        return with().carts();
    }

    @Override
    public ByProjectKeyCartDiscountsRequestBuilder cartDiscounts() {
        return with().cartDiscounts();
    }

    @Override
    public ByProjectKeyChannelsRequestBuilder channels() {
        return with().channels();
    }

    @Override
    public ByProjectKeyCustomersRequestBuilder customers() {
        return with().customers();
    }

    @Override
    public ByProjectKeyCustomerGroupsRequestBuilder customerGroups() {
        return with().customerGroups();
    }

    @Override
    public ByProjectKeyCustomObjectsRequestBuilder customObjects() {
        return with().customObjects();
    }

    @Override
    public ByProjectKeyDiscountCodesRequestBuilder discountCodes() {
        return with().discountCodes();
    }

    @Override
    public ByProjectKeyGraphqlRequestBuilder graphql() {
        return with().graphql();
    }

    @Override
    public ByProjectKeyInventoryRequestBuilder inventory() {
        return with().inventory();
    }

    @Override
    public ByProjectKeyLoginRequestBuilder login() {
        return with().login();
    }

    @Override
    public ByProjectKeyMessagesRequestBuilder messages() {
        return with().messages();
    }

    @Override
    public ByProjectKeyOrdersRequestBuilder orders() {
        return with().orders();
    }

    @Override
    public ByProjectKeyPaymentsRequestBuilder payments() {
        return with().payments();
    }

    @Override
    public ByProjectKeyProductsRequestBuilder products() {
        return with().products();
    }

    @Override
    public ByProjectKeyProductDiscountsRequestBuilder productDiscounts() {
        return with().productDiscounts();
    }

    @Override
    public ByProjectKeyProductProjectionsRequestBuilder productProjections() {
        return with().productProjections();
    }

    @Override
    public ByProjectKeyProductSelectionsRequestBuilder productSelections() {
        return with().productSelections();
    }

    @Override
    public ByProjectKeyProductTypesRequestBuilder productTypes() {
        return with().productTypes();
    }

    @Override
    public ByProjectKeyReviewsRequestBuilder reviews() {
        return with().reviews();
    }

    @Override
    public ByProjectKeyShippingMethodsRequestBuilder shippingMethods() {
        return with().shippingMethods();
    }

    @Override
    public ByProjectKeyShoppingListsRequestBuilder shoppingLists() {
        return with().shoppingLists();
    }

    @Override
    public ByProjectKeyStatesRequestBuilder states() {
        return with().states();
    }

    @Override
    public ByProjectKeySubscriptionsRequestBuilder subscriptions() {
        return with().subscriptions();
    }

    @Override
    public ByProjectKeyTaxCategoriesRequestBuilder taxCategories() {
        return with().taxCategories();
    }

    @Override
    public ByProjectKeyTypesRequestBuilder types() {
        return with().types();
    }

    @Override
    public ByProjectKeyZonesRequestBuilder zones() {
        return with().zones();
    }

    @Override
    public ByProjectKeyMeRequestBuilder me() {
        return with().me();
    }

    @Override
    public ByProjectKeyExtensionsRequestBuilder extensions() {
        return with().extensions();
    }

    @Override
    public ByProjectKeyApiClientsRequestBuilder apiClients() {
        return with().apiClients();
    }

    @Override
    public ByProjectKeyStoresRequestBuilder stores() {
        return with().stores();
    }

    @Override
    public ByProjectKeyInStoreKeyByStoreKeyRequestBuilder inStore(String storeKey) {
        return with().inStoreKeyWithStoreKeyValue(storeKey);
    }

    @Override
    public ByProjectKeyBusinessUnitsRequestBuilder businessUnits() {
        return with().businessUnits();
    }

    @Override
    public ByProjectKeyQuotesRequestBuilder quotes() {
        return with().quotes();
    }

    @Override
    public ByProjectKeyQuoteRequestsRequestBuilder quoteRequests() {
        return with().quoteRequests();
    }

    @Override
    public ByProjectKeyStagedQuotesRequestBuilder stagedQuotes() {
        return with().stagedQuotes();
    }

    @Override
    public ByProjectKeyStandalonePricesRequestBuilder standalonePrices() {
        return with().standalonePrices();
    }

    @Override
    public ByProjectKeyAttributeGroupsRequestBuilder attributeGroups() {
        return with().attributeGroups();
    }

    @Override
    public ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyRequestBuilder inBusinessUnit(final String businessUnitKey) {
        return with().inBusinessUnitKeyWithBusinessUnitKeyValue(businessUnitKey);
    }

    @Override
    public <R> R with(Function<ProjectApiRoot, R> op) {
        return op.apply(this);
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
