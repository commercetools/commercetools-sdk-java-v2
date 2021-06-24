
package cleanup;

import static commercetools.utils.CommercetoolsTestUtils.assertEventually;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;

import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.ResourcePagedQueryResponse;
import com.commercetools.api.models.category.CategoryPagedQueryResponse;
import com.commercetools.api.models.common.BaseResource;
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

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.error.NotFoundException;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Please be careful when running these tests, as they are meant to be used as cleanup and will delete all resources in your project
 */
public class DeleteEverythingIntegrationTest {

    final int concurrency = 30;
    final BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(concurrency);
    final ExecutorService threadPool = Executors.newFixedThreadPool(concurrency);

    private void initWorkers() {
        for (int i = 0; i < concurrency; i++) {
            threadPool.execute(() -> {
                try {
                    while (!threadPool.isTerminated()) {
                        Runnable runnable = blockingQueue.poll(10, TimeUnit.SECONDS);
                        if (runnable == null) {
                            break;
                        }
                        try {
                            runnable.run();
                        }
                        catch (NotFoundException ignored) {
                        }
                    }
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    @Test
    public void execute() {
        initWorkers();
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
            deleteAllStates();
            deleteAllStores();
            deleteAllChannels();
            deleteAllCustomerGroups();
            deleteAllTypes();
            deleteAllZones();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        threadPool.shutdown();
    }

    private <T extends PagedQueryResourceRequest<T, TResult>, TResult extends ResourcePagedQueryResponse<TResource>, TResource extends BaseResource> void deleteAllResources(
            PagedQueryResourceRequest<T, TResult> request, Consumer<TResource> deleteFn) {

        ApiHttpResponse<TResult> response = request.withLimit(100).withSort("id ASC").executeBlocking();

        do {
            List<TResource> results = response.getBody().getResults();
            if (results.size() > 0) {
                results.forEach(deleteFn);
                String lastId = results.get(results.size() - 1).getId();
                response = request.withLimit(100)
                        .withSort("id ASC")
                        .withWhere("id > :lastId")
                        .withPredicateVar("lastId", lastId)
                        .executeBlocking();
            }
        } while (response.getBody().getCount() >= response.getBody().getLimit());
    }

    private void checkDepends(Runnable block) {
        assertEventually(Duration.ofSeconds(60), Duration.ofMillis(1000), block);
    }

    private void deleteAllZones() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().zones().get(),
            (zone) -> ZoneFixtures.deleteZone(zone.getId(), zone.getVersion()));
    }

    private void deleteAllOrderEdits() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().orders().edits().get(),
            (orderEdit) -> OrdersFixtures.deleteOrderEdit(orderEdit.getId(), orderEdit.getVersion()));
    }

    private void deleteAllOrders() {
        checkDepends(() -> Assertions.assertThat(
            CommercetoolsTestUtils.getProjectRoot().orders().edits().get().executeBlocking().getBody().getCount())
                .isZero());

        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().orders().get(),
            (order) -> OrdersFixtures.deleteOrder(order.getId(), order.getVersion()));
    }

    private void deleteAllCarts() {
        checkDepends(() -> Assertions
                .assertThat(
                    CommercetoolsTestUtils.getProjectRoot().orders().get().executeBlocking().getBody().getCount())
                .isZero());
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().carts().get(),
            (cart) -> CartsFixtures.deleteCart(cart.getId(), cart.getVersion()));
    }

    private void deleteAllTypes() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().types().get(),
            (type) -> TypeFixtures.deleteType(type.getId(), type.getVersion()));
    }

    private void deleteAllStores() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().stores().get(),
            (store) -> StoreFixtures.deleteStore(store.getId(), store.getVersion()));
    }

    private void deleteAllStates() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().states().get().withWhere("initial = false"),
            (state) -> StateFixtures.deleteState(state.getId(), state.getVersion()));
    }

    private void deleteAllShoppingLists() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().shoppingLists().get(),
            (shoppingList) -> ShoppingListFixtures.deleteShoppingList(shoppingList.getId(), shoppingList.getVersion()));
    }

    private void deleteAllShippingMethods() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().shippingMethods().get(),
            (shippingMethod) -> ShippingMethodFixtures.deleteShippingMethod(shippingMethod.getId(),
                shippingMethod.getVersion()));
    }

    private void deleteAllExtensions() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().extensions().get(),
            (extension) -> ExtensionFixtures.deleteExtension(extension.getId(), extension.getVersion()));
    }

    private void deleteAllCustomerGroups() {
        checkDepends(() -> Assertions
                .assertThat(
                    CommercetoolsTestUtils.getProjectRoot().customers().get().executeBlocking().getBody().getCount())
                .isZero());
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().customerGroups().get(),
            (customerGroup) -> CustomerGroupFixtures.deleteCustomerGroup(customerGroup.getId(),
                customerGroup.getVersion()));
    }

    private void deleteAllCustomers() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().customers().get(),
            (customer) -> CustomerFixtures.deleteCustomer(customer.getId(), customer.getVersion()));
    }

    private void deleteAllCustomObjects() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().customObjects().get(),
            (customObject) -> CustomObjectFixtures.deleteCustomObject(customObject.getContainer(),
                customObject.getKey(), customObject.getVersion()));
    }

    private void deleteAllChannels() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().channels().get(),
            (channel) -> ChannelFixtures.deleteChannel(channel.getId(), channel.getVersion()));
    }

    private void deleteAllCategories() {
        CategoryPagedQueryResponse response;

        do {
            response = CommercetoolsTestUtils.getProjectRoot().categories().get().executeBlocking().getBody();
            response.getResults().forEach(category -> {
                CategoryFixtures.deleteCategory(category.getId(), category.getVersion());
            });
        } while (response.getResults().size() != 0);
    }

    private void deleteAllCartDiscounts() {
        checkDepends(() -> Assertions.assertThat(
            CommercetoolsTestUtils.getProjectRoot().discountCodes().get().executeBlocking().getBody().getCount())
                .isZero());

        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().cartDiscounts().get(),
            (cartDiscount) -> CartDiscountFixtures.deleteCartDiscount(cartDiscount.getId(), cartDiscount.getVersion()));
    }

    private void deleteAllInventories() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().inventory().get(),
            (inventoryEntry) -> InventoryEntryFixtures.delete(inventoryEntry.getId()));
    }

    private void deleteAllProducts() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().products().get(), ProductFixtures::deleteProduct);
    }

    private void deleteAllProductDiscounts() {
        checkDepends(() -> Assertions
                .assertThat(
                    CommercetoolsTestUtils.getProjectRoot().products().get().executeBlocking().getBody().getCount())
                .isZero());
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().productDiscounts().get(),
            (productDiscount) -> ProductDiscountFixtures.deleteProductDiscount(productDiscount.getId(),
                productDiscount.getVersion()));
    }

    private void deleteAllProductTypes() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().productTypes().get(),
            (productType) -> ProductTypeFixtures.deleteProductType(productType.getId(), productType.getVersion()));
    }

    private void deleteAllReviews() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().reviews().get(),
            (review) -> ReviewFixtures.delete(review.getId(), review.getVersion()));
    }

    private void deleteAllTaxCategories() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().taxCategories().get(),
            (taxCategory) -> TaxCategoryFixtures.deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion()));
    }

    private void deleteAllDiscountCodes() {
        deleteAllResources(CommercetoolsTestUtils.getProjectRoot().discountCodes().get(),
            (discountCode) -> DiscountCodeFixtures.deleteDiscountCode(discountCode.getId(), discountCode.getVersion()));
    }
}
