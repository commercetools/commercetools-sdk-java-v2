
package com.commercetools.api.client;

import java.util.function.Function;

import com.commercetools.api.models.project.ProjectUpdate;

public interface ProjectScopedApiRoot {
    ByProjectKeyRequestBuilder with();

    ByProjectKeyGet get();

    ByProjectKeyPost post(ProjectUpdate projectUpdate);

    ByProjectKeyCategoriesRequestBuilder categories();

    ByProjectKeyCartsRequestBuilder carts();

    ByProjectKeyCartDiscountsRequestBuilder cartDiscounts();

    ByProjectKeyChannelsRequestBuilder channels();

    ByProjectKeyCustomersRequestBuilder customers();

    ByProjectKeyCustomerGroupsRequestBuilder customerGroups();

    ByProjectKeyCustomObjectsRequestBuilder customObjects();

    ByProjectKeyDiscountCodesRequestBuilder discountCodes();

    ByProjectKeyGraphqlRequestBuilder graphql();

    ByProjectKeyInventoryRequestBuilder inventory();

    ByProjectKeyLoginRequestBuilder login();

    ByProjectKeyMessagesRequestBuilder messages();

    ByProjectKeyOrdersRequestBuilder orders();

    ByProjectKeyPaymentsRequestBuilder payments();

    ByProjectKeyProductsRequestBuilder products();

    ByProjectKeyProductDiscountsRequestBuilder productDiscounts();

    ByProjectKeyProductProjectionsRequestBuilder productProjections();

    ByProjectKeyProductSelectionsRequestBuilder productSelections();

    ByProjectKeyProductTypesRequestBuilder productTypes();

    ByProjectKeyReviewsRequestBuilder reviews();

    ByProjectKeyShippingMethodsRequestBuilder shippingMethods();

    ByProjectKeyShoppingListsRequestBuilder shoppingLists();

    ByProjectKeyStatesRequestBuilder states();

    ByProjectKeySubscriptionsRequestBuilder subscriptions();

    ByProjectKeyTaxCategoriesRequestBuilder taxCategories();

    ByProjectKeyTypesRequestBuilder types();

    ByProjectKeyZonesRequestBuilder zones();

    ByProjectKeyMeRequestBuilder me();

    ByProjectKeyExtensionsRequestBuilder extensions();

    ByProjectKeyApiClientsRequestBuilder apiClients();

    ByProjectKeyStoresRequestBuilder stores();

    ByProjectKeyInStoreKeyByStoreKeyRequestBuilder inStore(String storeKey);

    ByProjectKeyBusinessUnitsRequestBuilder businessUnits();

    ByProjectKeyQuotesRequestBuilder quotes();

    ByProjectKeyQuoteRequestsRequestBuilder quoteRequests();

    ByProjectKeyStagedQuotesRequestBuilder stagedQuotes();

    ByProjectKeyStandalonePricesRequestBuilder standalonePrices();

    ByProjectKeyAttributeGroupsRequestBuilder attributeGroups();

    ByProjectKeyInBusinessUnitKeyByBusinessUnitKeyRequestBuilder inBusinessUnit(String businessUnitKey);

    <R> R with(Function<ProjectApiRoot, R> op);
}
