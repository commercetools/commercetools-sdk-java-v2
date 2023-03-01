
package example;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.api_client.ApiClient;
import com.commercetools.api.models.api_client.ApiClientDraft;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.cart_discount.CartDiscountDraft;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryDraft;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelDraft;
import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerDraft;
import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.customer_group.CustomerGroupDraft;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.discount_code.DiscountCodeDraft;
import com.commercetools.api.models.extension.Extension;
import com.commercetools.api.models.extension.ExtensionDraft;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.inventory.InventoryEntryDraft;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderFromCartDraft;
import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditDraft;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.payment.PaymentDraft;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductDraft;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_discount.ProductDiscountDraft;
import com.commercetools.api.models.product_selection.ProductSelection;
import com.commercetools.api.models.product_selection.ProductSelectionDraft;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.product_type.ProductTypeDraft;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewDraft;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shipping_method.ShippingMethodDraft;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListDraft;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.state.StateDraft;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.store.StoreDraft;
import com.commercetools.api.models.subscription.Subscription;
import com.commercetools.api.models.subscription.SubscriptionDraft;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxCategoryDraft;
import com.commercetools.api.models.type.Type;
import com.commercetools.api.models.type.TypeDraft;
import com.commercetools.api.models.zone.Zone;
import com.commercetools.api.models.zone.ZoneDraft;

public class CommandMigrationTest {
    ProjectApiRoot projectApiRoot;

    String storeKey;

    String id;
    Long version;

    String orderNumber;

    public void apiClientCreateCommand() {
        ApiClientDraft draft = ApiClientDraft.builder().build();
        projectApiRoot.apiClients().post(draft);
    }

    public void cartDiscountCreateCommand() {
        CartDiscountDraft draft = CartDiscountDraft.builder().build();
        projectApiRoot.cartDiscounts().post(draft);
    }

    public void cartCreateCommand() {
        CartDraft draft = CartDraft.builder().build();
        projectApiRoot.carts().post(draft);
    }

    public void cartInStoreCreateCommand() {
        CartDraft draft = CartDraft.builder().build();
        projectApiRoot.inStore(storeKey).carts().post(draft);
    }

    public void categoryCreateCommand() {
        CategoryDraft draft = CategoryDraft.builder().build();
        projectApiRoot.categories().post(draft);
    }

    public void channelCreateCommand() {
        ChannelDraft draft = ChannelDraft.builder().build();
        projectApiRoot.channels().post(draft);
    }

    public void customerGroupCreateCommand() {
        CustomerGroupDraft draft = CustomerGroupDraft.builder().build();
        projectApiRoot.customerGroups().post(draft);
    }

    public void customerCreateCommand() {
        CustomerDraft draft = CustomerDraft.builder().build();
        projectApiRoot.customers().post(draft);
    }

    public void customerInStoreCreateCommand() {
        CustomerDraft draft = CustomerDraft.builder().build();
        projectApiRoot.inStore(storeKey).customers().post(draft);
    }

    public void discountCodeCreateCommand() {
        DiscountCodeDraft draft = DiscountCodeDraft.builder().build();
        projectApiRoot.discountCodes().post(draft);

    }

    public void extensionCreateCommand() {
        ExtensionDraft draft = ExtensionDraft.builder().build();
        projectApiRoot.extensions().post(draft);

    }

    public void inventoryEntryCreateCommand() {
        InventoryEntryDraft draft = InventoryEntryDraft.builder().build();
        projectApiRoot.inventory().post(draft);
    }

    public void orderEditCreateCommand() {
        OrderEditDraft draft = OrderEditDraft.builder().build();
        projectApiRoot.orders().edits().post(draft);
    }

    public void orderFromCartCreateCommand() {
        OrderFromCartDraft draft = OrderFromCartDraft.builder().build();
        projectApiRoot.orders().post(draft);
    }

    public void orderFromCartInStoreCreateCommand() {
        OrderFromCartDraft draft = OrderFromCartDraft.builder().build();
        projectApiRoot.inStore(storeKey).orders().post(draft);
    }

    public void paymentCreateCommand() {
        PaymentDraft draft = PaymentDraft.builder().build();
        projectApiRoot.payments().post(draft);
    }

    public void productDiscountCreateCommand() {
        ProductDiscountDraft draft = ProductDiscountDraft.builder().build();
        projectApiRoot.productDiscounts().post(draft);
    }

    public void productCreateCommand() {
        ProductDraft draft = ProductDraft.builder().build();
        projectApiRoot.products().post(draft);
    }

    public void productSelectionCreateCommand() {
        ProductSelectionDraft draft = ProductSelectionDraft.builder().build();
        projectApiRoot.productSelections().post(draft);
    }

    public void productTypeCreateCommand() {
        ProductTypeDraft draft = ProductTypeDraft.builder().build();
        projectApiRoot.productTypes().post(draft);
    }

    public void reviewCreateCommand() {
        ReviewDraft draft = ReviewDraft.builder().build();
        projectApiRoot.reviews().post(draft);
    }

    public void shippingMethodCreateCommand() {
        ShippingMethodDraft draft = ShippingMethodDraft.builder().build();
        projectApiRoot.shippingMethods().post(draft);
    }

    public void shoppingListCreateCommand() {
        ShoppingListDraft draft = ShoppingListDraft.builder().build();
        projectApiRoot.shoppingLists().post(draft);
    }

    public void shoppingListInStoreCreateCommand() {
        ShoppingListDraft draft = ShoppingListDraft.builder().build();
        projectApiRoot.inStore(storeKey).shoppingLists().post(draft);
    }

    public void stateCreateCommand() {
        StateDraft draft = StateDraft.builder().build();
        projectApiRoot.states().post(draft);
    }

    public void storeCreateCommand() {
        StoreDraft draft = StoreDraft.builder().build();
        projectApiRoot.stores().post(draft);
    }

    public void subscriptionCreateCommand() {
        SubscriptionDraft draft = SubscriptionDraft.builder().build();
        projectApiRoot.subscriptions().post(draft);
    }

    public void taxCategoryCreateCommand() {
        TaxCategoryDraft draft = TaxCategoryDraft.builder().build();
        projectApiRoot.taxCategories().post(draft);
    }

    public void typeCreateCommand() {
        TypeDraft draft = TypeDraft.builder().build();
        projectApiRoot.types().post(draft);
    }

    public void zoneCreateCommand() {
        ZoneDraft draft = ZoneDraft.builder().build();
        projectApiRoot.zones().post(draft);
    }

    public void cartDiscountUpdateCommand() {
        CartDiscount resource = CartDiscount.of();
        projectApiRoot.cartDiscounts()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.cartDiscounts().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void cartInStoreUpdateCommand() {
        Cart resource = Cart.of();
        projectApiRoot.inStore(storeKey)
                .carts()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        //        projectApiRoot.inStore(storeKey).carts().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void cartUpdateCommand() {
        Cart resource = Cart.of();
        projectApiRoot.carts()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.carts().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void categoryUpdateCommand() {
        Category resource = Category.of();
        projectApiRoot.categories()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.categories().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void channelUpdateCommand() {
        Channel resource = Channel.of();
        projectApiRoot.channels()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.channels().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void customerGroupUpdateCommand() {
        CustomerGroup resource = CustomerGroup.of();
        projectApiRoot.customerGroups()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.customerGroups().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void customerInStoreUpdateCommand() {
        Customer resource = Customer.of();
        projectApiRoot.inStore(storeKey)
                .customers()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        //        projectApiRoot.inStore(storeKey).customers().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void customerUpdateCommand() {
        Customer resource = Customer.of();
        projectApiRoot.customers()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.customers().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void discountCodeUpdateCommand() {
        DiscountCode resource = DiscountCode.of();
        projectApiRoot.discountCodes()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.discountCodes().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void extensionUpdateCommand() {
        Extension resource = Extension.of();
        projectApiRoot.extensions()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.extensions().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void inventoryEntryUpdateCommand() {
        InventoryEntry resource = InventoryEntry.of();
        projectApiRoot.inventory()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.inventory().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void orderEditUpdateCommand() {
        OrderEdit resource = OrderEdit.of();
        projectApiRoot.orders()
                .edits()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        //        projectApiRoot.orders().edits().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void orderInStoreUpdateByIdCommand() {
        Order resource = Order.of();
        projectApiRoot.inStore(storeKey)
                .orders()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        //        projectApiRoot.inStore(storeKey).orders().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void orderInStoreUpdateByOrderNumberCommand() {
        Order resource = Order.of();
        projectApiRoot.inStore(storeKey)
                .orders()
                .withOrderNumber(resource.getOrderNumber())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        //        projectApiRoot.inStore(storeKey).orders().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void orderUpdateCommand() {
        Order resource = Order.of();
        projectApiRoot.orders().withId(id).post(updateBuilder -> updateBuilder.version(version));
        projectApiRoot.orders().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void paymentUpdateCommand() {
        Payment resource = Payment.of();
        projectApiRoot.payments()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.payments().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void productDiscountUpdateCommand() {
        ProductDiscount resource = ProductDiscount.of();
        projectApiRoot.productDiscounts()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.productDiscounts().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void productUpdateCommand() {
        Product resource = Product.of();
        projectApiRoot.products()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.products().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void productSelectionUpdateCommand() {
        ProductSelection resource = ProductSelection.of();
        projectApiRoot.productSelections()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        //        projectApiRoot.productSelections().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void productTypeUpdateCommand() {
        ProductType resource = ProductType.of();
        projectApiRoot.productTypes()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.productTypes().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void reviewUpdateCommand() {
        Review resource = Review.of();
        projectApiRoot.reviews()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.reviews().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void shippingMethodUpdateCommand() {
        ShippingMethod resource = ShippingMethod.of();
        projectApiRoot.shippingMethods()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.shippingMethods().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void shoppingListInStoreUpdateCommand() {
        ShoppingList resource = ShoppingList.of();
        projectApiRoot.inStore(storeKey)
                .shoppingLists()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        //        projectApiRoot.inStore(storeKey).shoppingLists().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void shoppingListUpdateCommand() {
        ShoppingList resource = ShoppingList.of();
        projectApiRoot.shoppingLists()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.shoppingLists().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void stateUpdateCommand() {
        State resource = State.of();
        projectApiRoot.states()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.states().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void storeUpdateCommand() {
        Store resource = Store.of();
        projectApiRoot.stores()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.stores().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void subscriptionUpdateCommand() {
        Subscription resource = Subscription.of();
        projectApiRoot.subscriptions()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.subscriptions().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void taxCategoryUpdateCommand() {
        TaxCategory resource = TaxCategory.of();
        projectApiRoot.taxCategories()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.taxCategories().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void typeUpdateCommand() {
        Type resource = Type.of();
        projectApiRoot.types()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.types().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void zoneUpdateCommand() {
        Zone resource = Zone.of();
        projectApiRoot.zones()
                .withId(resource.getId())
                .post(updateBuilder -> updateBuilder.version(resource.getVersion()));
        projectApiRoot.zones().update(resource).with(actionsBuilder -> actionsBuilder);
    }

    public void apiClientDeleteCommand() {
        ApiClient resource = ApiClient.of();
        projectApiRoot.apiClients().withId(resource.getId()).delete();
        projectApiRoot.apiClients().delete(resource);
    }

    public void cartDiscountDeleteCommand() {
        CartDiscount resource = CartDiscount.of();
        projectApiRoot.cartDiscounts().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.cartDiscounts().delete(resource);
    }

    public void cartDeleteCommand() {
        Cart resource = Cart.of();
        projectApiRoot.carts().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.carts().delete(resource);
    }

    public void cartInStoreDeleteCommand() {
        Cart resource = Cart.of();
        projectApiRoot.inStore(storeKey).carts().withId(resource.getId()).delete().withVersion(resource.getVersion());
        //        projectApiRoot.inStore(storeKey).carts().delete(resource);
    }

    public void categoryDeleteCommand() {
        Category resource = Category.of();
        projectApiRoot.categories().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.categories().delete(resource);
    }

    public void channelDeleteCommand() {
        Channel resource = Channel.of();
        projectApiRoot.channels().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.channels().delete(resource);
    }

    public void customerGroupDeleteCommand() {
        CustomerGroup resource = CustomerGroup.of();
        projectApiRoot.customerGroups().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.customerGroups().delete(resource);
    }

    public void customerDeleteCommand() {
        Customer resource = Customer.of();
        projectApiRoot.customers().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.customers().delete(resource);
    }

    public void customerInStoreDeleteCommand() {
        Customer resource = Customer.of();
        projectApiRoot.inStore(storeKey).carts().withId(resource.getId()).delete().withVersion(resource.getVersion());
        //        projectApiRoot.inStore(storeKey).carts().delete(resource);
    }

    public void customObjectDeleteCommand() {
        CustomObject resource = CustomObject.of();
        projectApiRoot.customObjects()
                .withContainerAndKey(resource.getContainer(), resource.getKey())
                .delete()
                .withVersion(resource.getVersion());
        //        projectApiRoot.customObjects().delete(resource);
    }

    public void discountCodeDeleteCommand() {
        DiscountCode resource = DiscountCode.of();
        projectApiRoot.discountCodes().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.discountCodes().delete(resource);
    }

    public void extensionDeleteCommand() {
        Extension resource = Extension.of();
        projectApiRoot.extensions().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.extensions().delete(resource);
    }

    public void inventoryEntryDeleteCommand() {
        InventoryEntry resource = InventoryEntry.of();
        projectApiRoot.inventory().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.inventory().delete(resource);
    }

    public void orderEditDeleteCommand() {
        OrderEdit resource = OrderEdit.of();
        projectApiRoot.orders().edits().withId(resource.getId()).delete().withVersion(resource.getVersion());
        //        projectApiRoot.orders().edits().delete(resource);
    }

    public void orderDeleteCommand() {
        Order resource = Order.of();
        projectApiRoot.orders().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.orders().delete(resource);
    }

    public void orderInStoreDeleteByIdCommand() {
        Order resource = Order.of();
        projectApiRoot.inStore(storeKey).orders().withId(resource.getId()).delete().withVersion(resource.getVersion());
        //        projectApiRoot.inStore(storeKey).orders().delete(resource);
    }

    public void orderInStoreDeleteByOrderNumberCommand() {
        Order resource = Order.of();
        projectApiRoot.inStore(storeKey)
                .orders()
                .withOrderNumber(resource.getOrderNumber())
                .delete()
                .withVersion(resource.getVersion());
    }

    public void paymentDeleteCommand() {
        Payment resource = Payment.of();
        projectApiRoot.payments().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.payments().delete(resource);
    }

    public void productDiscountDeleteCommand() {
        ProductDiscount resource = ProductDiscount.of();
        projectApiRoot.productDiscounts().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.productDiscounts().delete(resource);
    }

    public void productDeleteCommand() {
        Product resource = Product.of();
        projectApiRoot.products().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.products().delete(resource);
    }

    public void productSelectionDeleteCommand() {
        ProductSelection resource = ProductSelection.of();
        projectApiRoot.productSelections().withId(resource.getId()).delete().withVersion(resource.getVersion());
        //        projectApiRoot.productSelections().delete(resource);
    }

    public void productTypeDeleteCommand() {
        ProductType resource = ProductType.of();
        projectApiRoot.productTypes().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.productTypes().delete(resource);
    }

    public void reviewDeleteCommand() {
        Review resource = Review.of();
        projectApiRoot.reviews().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.reviews().delete(resource);
    }

    public void shippingMethodDeleteCommand() {
        ShippingMethod resource = ShippingMethod.of();
        projectApiRoot.shippingMethods().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.shippingMethods().delete(resource);
    }

    public void shoppingListDeleteCommand() {
        ShoppingList resource = ShoppingList.of();
        projectApiRoot.shoppingLists().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.shoppingLists().delete(resource);
    }

    public void shoppingListInStoreDeleteCommand() {
        ShoppingList resource = ShoppingList.of();
        projectApiRoot.inStore(storeKey)
                .shoppingLists()
                .withId(resource.getId())
                .delete()
                .withVersion(resource.getVersion());
        //        projectApiRoot.inStore(storeKey).shoppingLists().delete(resource);
    }

    public void stateDeleteCommand() {
        State resource = State.of();
        projectApiRoot.states().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.states().delete(resource);
    }

    public void storeDeleteCommand() {
        Store resource = Store.of();
        projectApiRoot.stores().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.stores().delete(resource);
    }

    public void subscriptionDeleteCommand() {
        Subscription resource = Subscription.of();
        projectApiRoot.subscriptions().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.subscriptions().delete(resource);
    }

    public void taxCategoryDeleteCommand() {
        TaxCategory resource = TaxCategory.of();
        projectApiRoot.taxCategories().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.taxCategories().delete(resource);
    }

    public void typeDeleteCommand() {
        Type resource = Type.of();
        projectApiRoot.types().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.types().delete(resource);
    }

    public void zoneDeleteCommand() {
        Zone resource = Zone.of();
        projectApiRoot.zones().withId(resource.getId()).delete().withVersion(resource.getVersion());
        projectApiRoot.zones().delete(resource);
    }
}
