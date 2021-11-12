
package cleanup;

import static commercetools.utils.CommercetoolsTestUtils.assertEventually;

import java.time.Duration;
import java.util.function.Consumer;

import com.commercetools.api.client.QueryUtils;
import com.commercetools.api.models.DomainResource;
import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.ResourcePagedQueryResponse;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.state.*;
import commercetools.cart.CartsFixtures;
import commercetools.cart_discount.CartDiscountFixtures;
import commercetools.category.CategoryFixtures;
import commercetools.channel.ChannelFixtures;
import commercetools.custom_object.CustomObjectFixtures;
import commercetools.customer.CustomerFixtures;
import commercetools.customer_group.CustomerGroupFixtures;
import commercetools.discount_code.DiscountCodeFixtures;
import commercetools.extension.ExtensionFixtures;
import commercetools.inventory.InventoryEntryFixtures;
import commercetools.order.OrdersFixtures;
import commercetools.product.ProductFixtures;
import commercetools.product_discount.ProductDiscountFixtures;
import commercetools.product_type.ProductTypeFixtures;
import commercetools.review.ReviewFixtures;
import commercetools.shipping_method.ShippingMethodFixtures;
import commercetools.shopping_list.ShoppingListFixtures;
import commercetools.state.StateFixtures;
import commercetools.store.StoreFixtures;
import commercetools.tax_category.TaxCategoryFixtures;
import commercetools.type.TypeFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.zone.ZoneFixtures;

import io.vrap.rmf.base.client.error.NotFoundException;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Please be careful when running these tests, as they are meant to be used as cleanup and will delete all resources in your project
 */
public class DeleteEverythingIntegrationTest {

    @Test
    public void execute() {
        try {
            deleteAllExtensions();
            deleteAllOrderEdits();
            deleteAllOrders();
            deleteAllCarts();
            deleteAllDiscountCodes();
            deleteAllShoppingLists();
            deleteAllReviews();
            deleteAllCategories();
            deleteAllProducts();
            deleteAllCartDiscounts();
            deleteAllInventories();
            deleteAllProductTypes();
            deleteAllShippingMethods();
            deleteAllTaxCategories();
            deleteAllProductDiscounts();
            deleteAllCustomObjects();
            deleteAllCustomers();
            deleteAllStores();
            deleteAllChannels();
            deleteAllCustomerGroups();
            deleteAllTypes();
            deleteAllZones();
            deleteAllStates();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private <TMethod extends PagedQueryResourceRequest<TMethod, TResult>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>> void deleteAllResources(
            PagedQueryResourceRequest<TMethod, TResult> request, Consumer<TElement> deleteFn) {

        QueryUtils.queryAll(request, list -> {
            list.forEach(deleteFn);
        }, 100).toCompletableFuture().join();
    }

    private void checkDepends(Runnable block) {
        assertEventually(Duration.ofSeconds(60), Duration.ofMillis(1000), block);
    }

    private void deleteAllZones() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().zones().get(),
            (zone) -> ZoneFixtures.deleteZone(zone.getId(), zone.getVersion()));
    }

    private void deleteAllOrderEdits() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().orders().edits().get(),
            (orderEdit) -> OrdersFixtures.deleteOrderEdit(orderEdit.getId(), orderEdit.getVersion()));
    }

    private void deleteAllOrders() {
        checkDepends(() -> Assertions.assertThat(
            CommercetoolsTestUtils.getProjectApiRoot().orders().edits().get().executeBlocking().getBody().getCount())
                .isZero());

        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().orders().get(),
            (order) -> OrdersFixtures.deleteOrder(order.getId(), order.getVersion()));
    }

    private void deleteAllCarts() {
        checkDepends(() -> Assertions
                .assertThat(
                    CommercetoolsTestUtils.getProjectApiRoot().orders().get().executeBlocking().getBody().getCount())
                .isZero());
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().carts().get(),
            (cart) -> CartsFixtures.deleteCart(cart.getId(), cart.getVersion()));
    }

    private void deleteAllTypes() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().types().get(),
            (type) -> TypeFixtures.deleteType(type.getId(), type.getVersion()));
    }

    private void deleteAllStores() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().stores().get(),
            (store) -> StoreFixtures.deleteStore(store.getId(), store.getVersion()));
    }

    private void deleteAllStates() {
        QueryUtils.queryAll(CommercetoolsTestUtils.getProjectApiRoot().states().get(), states -> {
            states.forEach(state -> {
                if (state.getTransitions() != null) {
                    CommercetoolsTestUtils.getProjectApiRoot()
                            .states()
                            .withId(state.getId())
                            .post(StateUpdateBuilder.of()
                                    .version(state.getVersion())
                                    .actions(StateSetTransitionsActionBuilder.of().build())
                                    .build())
                            .executeBlocking();
                }
            });
        }, 100).toCompletableFuture().join();

        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().states().get().withWhere("builtIn = false"),
            (state) -> StateFixtures.deleteState(state.getId(), state.getVersion()));
    }

    private void deleteAllShoppingLists() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().shoppingLists().get(),
            (shoppingList) -> ShoppingListFixtures.deleteShoppingList(shoppingList.getId(), shoppingList.getVersion()));
    }

    private void deleteAllShippingMethods() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().shippingMethods().get(),
            (shippingMethod) -> ShippingMethodFixtures.deleteShippingMethod(shippingMethod.getId(),
                shippingMethod.getVersion()));
    }

    private void deleteAllExtensions() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().extensions().get(),
            (extension) -> ExtensionFixtures.deleteExtension(extension.getId(), extension.getVersion()));
    }

    private void deleteAllCustomerGroups() {
        checkDepends(() -> Assertions
                .assertThat(
                    CommercetoolsTestUtils.getProjectApiRoot().customers().get().executeBlocking().getBody().getCount())
                .isZero());
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().customerGroups().get(),
            (customerGroup) -> CustomerGroupFixtures.deleteCustomerGroup(customerGroup.getId(),
                customerGroup.getVersion()));
    }

    private void deleteAllCustomers() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().customers().get(),
            (customer) -> CustomerFixtures.deleteCustomer(customer.getId(), customer.getVersion()));
    }

    private void deleteAllCustomObjects() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().customObjects().get(),
            (customObject) -> CustomObjectFixtures.deleteCustomObject(customObject.getContainer(),
                customObject.getKey(), customObject.getVersion()));
    }

    private void deleteAllChannels() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().channels().get(),
            (channel) -> ChannelFixtures.deleteChannel(channel.getId(), channel.getVersion()));
    }

    private void deleteAllCategories() {
        CategoryPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getProjectApiRoot().categories().get().executeBlocking().getBody();
            response.getResults().forEach(category -> {
                try {
                    CategoryFixtures.deleteCategory(category.getId(), category.getVersion());
                }
                catch (NotFoundException ignored) {
                }
            });
        } while (response.getResults().size() != 0);
    }

    private void deleteAllCartDiscounts() {
        checkDepends(() -> Assertions.assertThat(
            CommercetoolsTestUtils.getProjectApiRoot().discountCodes().get().executeBlocking().getBody().getCount())
                .isZero());

        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().cartDiscounts().get(),
            (cartDiscount) -> CartDiscountFixtures.deleteCartDiscount(cartDiscount.getId(), cartDiscount.getVersion()));
    }

    private void deleteAllInventories() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().inventory().get(),
            (inventoryEntry) -> InventoryEntryFixtures.delete(inventoryEntry.getId()));
    }

    private void deleteAllProducts() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().products().get(), ProductFixtures::deleteProduct);
    }

    private void deleteAllProductDiscounts() {
        checkDepends(() -> Assertions
                .assertThat(
                    CommercetoolsTestUtils.getProjectApiRoot().products().get().executeBlocking().getBody().getCount())
                .isZero());
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().productDiscounts().get(),
            (productDiscount) -> ProductDiscountFixtures.deleteProductDiscount(productDiscount.getId(),
                productDiscount.getVersion()));
    }

    private void deleteAllProductTypes() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().productTypes().get(),
            (productType) -> ProductTypeFixtures.deleteProductType(productType.getId(), productType.getVersion()));
    }

    private void deleteAllReviews() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().reviews().get(),
            (review) -> ReviewFixtures.delete(review.getId(), review.getVersion()));
    }

    private void deleteAllTaxCategories() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().taxCategories().get(),
            (taxCategory) -> TaxCategoryFixtures.deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion()));
    }

    private void deleteAllDiscountCodes() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().discountCodes().get(),
            (discountCode) -> DiscountCodeFixtures.deleteDiscountCode(discountCode.getId(), discountCode.getVersion()));
    }
}
