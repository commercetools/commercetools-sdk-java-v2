
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

    private final boolean closeHttpClient;

    public ProjectApiRoot(final String projectKey, final ApiHttpClient apiHttpClient) {
        this(projectKey, apiHttpClient, true);
    }

    public ProjectApiRoot(final String projectKey, final ApiHttpClient apiHttpClient, final boolean closeHttpClient) {
        this.projectKey = projectKey;
        this.apiHttpClient = apiHttpClient;
        this.closeHttpClient = closeHttpClient;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public ApiHttpClient getApiHttpClient() {
        return apiHttpClient;
    }

    public static ProjectApiRoot of(final String projectKey) {
        return of(projectKey, true);
    }

    public static ProjectApiRoot fromClient(final String projectKey, final ApiHttpClient apiHttpClient) {
        return fromClient(projectKey, apiHttpClient, true);
    }

    public static ProjectApiRoot withContext(final String projectKey, final ApiHttpClient apiHttpClient,
            final Context context) {
        return withContext(projectKey, apiHttpClient, context, true);
    }

    public static ProjectApiRoot withContext(final ProjectApiRoot projectApiRoot, final Context context) {
        return withContext(projectApiRoot, context, true);
    }

    public static ProjectApiRoot of(final String projectKey, final boolean closeHttpClient) {
        return new ProjectApiRoot(projectKey, SerializerOnlyApiHttpClient.of(), closeHttpClient);
    }

    public static ProjectApiRoot fromClient(final String projectKey, final ApiHttpClient apiHttpClient,
            final boolean closeHttpClient) {
        return new ProjectApiRoot(projectKey, apiHttpClient, closeHttpClient);
    }

    public static ProjectApiRoot withContext(final String projectKey, final ApiHttpClient apiHttpClient,
            final Context context, final boolean closeHttpClient) {
        return new ProjectApiRoot(projectKey, ContextApiHttpClient.of(apiHttpClient, context, closeHttpClient),
            closeHttpClient);
    }

    public static ProjectApiRoot withContext(final ProjectApiRoot projectApiRoot, final Context context,
            final boolean closeHttpClient) {
        return new ProjectApiRoot(projectApiRoot.projectKey,
            ContextApiHttpClient.of(projectApiRoot.apiHttpClient, context, closeHttpClient), closeHttpClient);
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
    public ByProjectKeyHead head() {
        return with().head();
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
    public ByProjectKeyAsAssociateRequestBuilder asAssociate() {
        return with().asAssociate();
    }

    @Override
    public ByProjectKeyAssociateRolesRequestBuilder associateRoles() {
        return with().associateRoles();
    }

    @Override
    public ByProjectKeyProductTailoringRequestBuilder productTailoring() {
        return with().productTailoring();
    }

    @Override
    public ByProjectKeyDiscountGroupsRequestBuilder discountGroups() {
        return with().discountGroups();
    }

    @Override
    public ByProjectKeyPaymentMethodsRequestBuilder paymentMethods() {
        return with().paymentMethods();
    }

    @Override
    public ByProjectKeyRecurringOrdersRequestBuilder recurringOrders() {
        return with().recurringOrders();
    }

    @Override
    public ByProjectKeyRecurrencePoliciesRequestBuilder recurrencePolicies() {
        return with().recurrencePolicies();
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
            if (closeHttpClient) {
                apiHttpClient.close();
            }
        }
        catch (final Throwable ignored) {
        }
    }
}
