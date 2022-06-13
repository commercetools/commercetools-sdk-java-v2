
package cleanup;

import static commercetools.cart.CartsFixtures.*;
import static commercetools.cart_discount.CartDiscountFixtures.*;
import static commercetools.category.CategoryFixtures.*;
import static commercetools.channel.ChannelFixtures.*;
import static commercetools.custom_object.CustomObjectFixtures.*;
import static commercetools.customer.CustomerFixtures.*;
import static commercetools.customer_group.CustomerGroupFixtures.*;
import static commercetools.discount_code.DiscountCodeFixtures.*;
import static commercetools.extension.ExtensionFixtures.*;
import static commercetools.inventory.InventoryEntryFixtures.*;
import static commercetools.order.OrdersFixtures.*;
import static commercetools.product_discount.ProductDiscountFixtures.*;
import static commercetools.product_type.ProductTypeFixtures.*;
import static commercetools.review.ReviewFixtures.*;
import static commercetools.shipping_method.ShippingMethodFixtures.*;
import static commercetools.shopping_list.ShoppingListFixtures.*;
import static commercetools.state.StateFixtures.*;
import static commercetools.store.StoreFixtures.*;
import static commercetools.tax_category.TaxCategoryFixtures.*;
import static commercetools.type.TypeFixtures.*;
import static commercetools.utils.CommercetoolsTestUtils.assertEventually;
import static commercetools.zone.ZoneFixtures.*;

import java.time.Duration;
import java.util.function.Consumer;

import com.commercetools.api.client.QueryUtils;
import com.commercetools.api.models.DomainResource;
import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.ResourcePagedQueryResponse;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.state.*;
import commercetools.product.ProductFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.error.NotFoundException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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
            deleteAllPayments();
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
            (zone) -> deleteZone(zone.getId(), zone.getVersion()));
    }

    private void deleteAllOrderEdits() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().orders().edits().get(),
            (orderEdit) -> deleteOrderEdit(orderEdit.getId(), orderEdit.getVersion()));
    }

    private void deleteAllOrders() {
        checkDepends(() -> Assertions.assertThat(
            CommercetoolsTestUtils.getProjectApiRoot().orders().edits().get().executeBlocking().getBody().getCount())
                .isZero());

        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().orders().get(),
            (order) -> deleteOrder(order.getId(), order.getVersion()));
    }

    private void deleteAllCarts() {
        checkDepends(() -> Assertions
                .assertThat(
                    CommercetoolsTestUtils.getProjectApiRoot().orders().get().executeBlocking().getBody().getCount())
                .isZero());
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().carts().get(),
            (cart) -> deleteCart(cart.getId(), cart.getVersion()));
    }

    private void deleteAllPayments() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().payments().get(),
            (payment) -> deleteType(payment.getId(), payment.getVersion()));
    }

    private void deleteAllTypes() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().types().get(),
            (type) -> deleteType(type.getId(), type.getVersion()));
    }

    private void deleteAllStores() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().stores().get(),
            (store) -> deleteStore(store.getId(), store.getVersion()));
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
            (state) -> deleteState(state.getId(), state.getVersion()));
    }

    private void deleteAllShoppingLists() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().shoppingLists().get(),
            (shoppingList) -> deleteShoppingList(shoppingList.getId(), shoppingList.getVersion()));
    }

    private void deleteAllShippingMethods() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().shippingMethods().get(),
            (shippingMethod) -> deleteShippingMethod(shippingMethod.getId(), shippingMethod.getVersion()));
    }

    private void deleteAllExtensions() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().extensions().get(),
            (extension) -> deleteExtension(extension.getId(), extension.getVersion()));
    }

    private void deleteAllCustomerGroups() {
        checkDepends(() -> Assertions
                .assertThat(
                    CommercetoolsTestUtils.getProjectApiRoot().customers().get().executeBlocking().getBody().getCount())
                .isZero());
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().customerGroups().get(),
            (customerGroup) -> deleteCustomerGroup(customerGroup.getId(), customerGroup.getVersion()));
    }

    private void deleteAllCustomers() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().customers().get(),
            (customer) -> deleteCustomer(customer.getId(), customer.getVersion()));
    }

    private void deleteAllCustomObjects() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().customObjects().get(),
            (customObject) -> deleteCustomObject(customObject.getContainer(), customObject.getKey(),
                customObject.getVersion()));
    }

    private void deleteAllChannels() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().channels().get(),
            (channel) -> deleteChannel(channel.getId(), channel.getVersion()));
    }

    private void deleteAllCategories() {
        CategoryPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getProjectApiRoot().categories().get().executeBlocking().getBody();
            response.getResults().forEach(category -> {
                try {
                    deleteCategory(category.getId(), category.getVersion());
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
            (cartDiscount) -> deleteCartDiscount(cartDiscount.getId(), cartDiscount.getVersion()));
    }

    private void deleteAllInventories() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().inventory().get(),
            (inventoryEntry) -> delete(inventoryEntry.getId()));
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
            (productDiscount) -> deleteProductDiscount(productDiscount.getId(), productDiscount.getVersion()));
    }

    private void deleteAllProductTypes() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().productTypes().get(),
            (productType) -> deleteProductType(productType.getId(), productType.getVersion()));
    }

    private void deleteAllReviews() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().reviews().get(),
            (review) -> deleteReview(review.getId(), review.getVersion()));
    }

    private void deleteAllTaxCategories() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().taxCategories().get(),
            (taxCategory) -> deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion()));
    }

    private void deleteAllDiscountCodes() {
        deleteAllResources(CommercetoolsTestUtils.getProjectApiRoot().discountCodes().get(),
            (discountCode) -> deleteDiscountCode(discountCode.getId(), discountCode.getVersion()));
    }
}
