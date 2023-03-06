
package example;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.business_unit.*;
import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.cart_discount.*;
import com.commercetools.api.models.category.*;
import com.commercetools.api.models.channel.*;
import com.commercetools.api.models.common.*;
import com.commercetools.api.models.custom_object.*;
import com.commercetools.api.models.customer.*;
import com.commercetools.api.models.customer_group.*;
import com.commercetools.api.models.discount_code.*;
import com.commercetools.api.models.extension.*;
import com.commercetools.api.models.inventory.*;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.tax_category.TaxRateBuilder;

import org.javamoney.moneta.CurrencyUnitBuilder;
import org.javamoney.moneta.FastMoney;

public class HelperMethodsTest {
    ProjectApiRoot projectApiRoot;

    // Business Unit helper methods examples
    private BusinessUnit createBusinessUnitFromDraft(ProjectApiRoot projectApiRoot) {
        final BusinessUnitDraft businessUnitDraft = BusinessUnitDraftBuilder.of()
                .companyBuilder()
                .name("test-name-" + UUID.randomUUID().toString())
                .key("test-key-" + UUID.randomUUID().toString())
                .contactEmail("test@example.com")
                .build();

        return projectApiRoot.businessUnits().post(businessUnitDraft).executeBlocking().getBody();
    }

    public void businessUnitSetCustomFieldUnset() {
        final BusinessUnit businessUnit = createBusinessUnitFromDraft(projectApiRoot);

        final BusinessUnit updatedBusinessUnit = projectApiRoot.businessUnits()
                .withId(businessUnit.getId())
                .post(BusinessUnitUpdateBuilder.of()
                        .version(businessUnit.getVersion())
                        .actions(BusinessUnitSetCustomFieldAction.ofUnset("test-custom-field"))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void businessUnitSetAddressCustomFieldUnset() {
        final BusinessUnit businessUnit = createBusinessUnitFromDraft(projectApiRoot);

        final BusinessUnit updatedBusinessUnit = projectApiRoot.businessUnits()
                .withId(businessUnit.getId())
                .post(BusinessUnitUpdateBuilder.of()
                        .version(businessUnit.getVersion())
                        .actions(BusinessUnitSetAddressCustomFieldAction.ofUnset("test-address-custom-field"))
                        .build())
                .executeBlocking()
                .getBody();
    }

    //Cart helper methods examples
    private Cart createCartFromDraft(ProjectApiRoot projectApiRoot) {
        final CartDraft cartDraft = CartDraftBuilder.of()
                .key("test-key-" + UUID.randomUUID().toString())
                .country("DE")
                .currency("EUR")
                .build();

        return projectApiRoot.carts().post(cartDraft).executeBlocking().getBody();
    }

    // TODO to be added
    public void cartInventoryModeDefaultValue() {

    }

    public void cartToResourceIdentifier() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final CartResourceIdentifier cartResourceIdentifier = cart.toResourceIdentifier();
    }

    public void cartToReference() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final CartReference cartReference = cart.toReference();
    }

    public void cartSetLineItemCustomFieldUnset() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final String lineId = "test-lineId-" + UUID.randomUUID().toString();
        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of()
                        .version(cart.getVersion())
                        .actions(CartSetLineItemCustomFieldAction.ofUnset(name, lineId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void cartSetCustomFieldUnset() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of()
                        .version(cart.getVersion())
                        .actions(CartSetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void cartSetCustomLineItemCustomFieldUnset() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final String customLineId = "test-customLineId-" + UUID.randomUUID().toString();
        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of()
                        .version(cart.getVersion())
                        .actions(CartSetCustomLineItemCustomFieldAction.ofUnset(name, customLineId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void cartSetDeleteDaysAfterLastModificationUnset() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of()
                        .version(cart.getVersion())
                        .actions(CartSetDeleteDaysAfterLastModificationAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void cartSetDeliveryAddressCustomFieldUnset() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final String deliveryId = "test-deliveryId-" + UUID.randomUUID().toString();
        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of()
                        .version(cart.getVersion())
                        .actions(CartSetDeliveryAddressCustomFieldAction.ofUnset(name, deliveryId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void cartSetItemShippingAddressCustomFieldUnset() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final String addressKey = "test-addressKey-" + UUID.randomUUID().toString();
        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of()
                        .version(cart.getVersion())
                        .actions(CartSetItemShippingAddressCustomFieldAction.ofUnset(name, addressKey))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void cartSetShippingAddressCustomFieldUnset() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of()
                        .version(cart.getVersion())
                        .actions(CartSetShippingAddressCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void cartSetShippingRateInputUnset() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of()
                        .version(cart.getVersion())
                        .actions(CartSetShippingRateInputAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void cartSetKeyUnset() {
        final Cart cart = createCartFromDraft(projectApiRoot);

        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of().version(cart.getVersion()).actions(CartSetKeyAction.ofUnset()).build())
                .executeBlocking()
                .getBody();
    }

    // Cart Discount helper methods examples
    private CartDiscount createCartDiscountFromDraft(ProjectApiRoot projectApiRoot) {
        final CartDiscountDraft cartDiscountDraft = CartDiscountDraftBuilder.of()
                .key("test-key-" + UUID.randomUUID().toString())
                .name(LocalizedStringBuilder.of().addValue("en", "cart-discount-name").build())
                .isActive(true)
                .build();

        return projectApiRoot.cartDiscounts().post(cartDiscountDraft).executeBlocking().getBody();
    }

    public void cartDiscountToResourceIdentifier() {
        final CartDiscount cartDiscount = createCartDiscountFromDraft(projectApiRoot);

        final CartDiscountResourceIdentifier cartDiscountResourceIdentifier = cartDiscount.toResourceIdentifier();
    }

    public void cartDiscountToReference() {
        final CartDiscount cartDiscount = createCartDiscountFromDraft(projectApiRoot);

        final CartDiscountReference cartDiscountReference = cartDiscount.toReference();
    }

    public void cartDiscountSetCustomFieldUnset() {
        final CartDiscount cartDiscount = createCartDiscountFromDraft(projectApiRoot);

        final CartDiscount updatedCartDiscount = projectApiRoot.cartDiscounts()
                .withId(cartDiscount.getId())
                .post(CartDiscountUpdateBuilder.of()
                        .version(cartDiscount.getVersion())
                        .actions(CartDiscountSetCustomFieldAction.ofUnset("test-custom-field"))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void cartDiscountSetKeyUnset() {
        final CartDiscount cartDiscount = createCartDiscountFromDraft(projectApiRoot);

        final CartDiscount updatedCartDiscount = projectApiRoot.cartDiscounts()
                .withId(cartDiscount.getId())
                .post(CartDiscountUpdateBuilder.of()
                        .version(cartDiscount.getVersion())
                        .actions(CartDiscountSetKeyAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    //Category helper methods examples
    private Category createCategoryFromDraft(ProjectApiRoot projectApiRoot) {
        final CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .key("test-key")
                .name(LocalizedStringBuilder.of().addValue("en", "category-name").build())
                .slug(LocalizedStringBuilder.of().addValue("en", "category-slug").build())
                .build();

        return projectApiRoot.categories().post(categoryDraft).executeBlocking().getBody();
    }

    private List<Category> createCategoryHierarchy() {
        final List<String> rootIds = asList("0", "1", "2", "3");
        final List<String> childIds = asList("a", "b", "c", "d", "e");
        final List<String> grandchildIds = asList("u", "v", "w", "x");

        final List<Category> rootCategories = rootIds.stream()
                .map(id -> CategoryBuilder.of(createCategoryFromDraft(projectApiRoot)).build())
                .collect(toList());
        final List<Category> children = createChildren(childIds, rootCategories);
        final List<Category> grandchildren = createChildren(grandchildIds, children);
        final List<Category> secondLevelCategories = rootCategories.stream()
                .flatMap(parent -> IntStream.range(1, 4).mapToObj(i -> {
                    final String id = parent.getId() + "-" + i;
                    return CategoryBuilder.of()
                            .id(id)
                            .name(LocalizedStringBuilder.of().addValue("en", "foo").build())
                            .parent(CategoryReferenceBuilder.of().id(id).build())
                            .ancestors(singletonList(parent.toReference()))
                            .externalId("external-id-" + id)
                            .build();
                }))
                .collect(Collectors.toList());
        final List<Category> allCategories = new LinkedList<>();
        allCategories.addAll(rootCategories);
        allCategories.addAll(children);
        allCategories.addAll(grandchildren);
        allCategories.addAll(secondLevelCategories);

        return allCategories;
    }

    private List<Category> createChildren(final List<String> childIds, final List<Category> rootCategories) {
        final List<Category> children = new LinkedList<>();
        rootCategories.stream().forEach(parent -> childIds.stream().forEach(childId -> {
            final Category child = CategoryBuilder.of()
                    .id(childId)
                    .ancestors(CategoryReferenceBuilder.of().id(parent.getId()).build())
                    .build();
            children.add(child);
        }));
        return children;
    }

    public void categoryToResourceIdentifier() {
        final Category category = createCategoryFromDraft(projectApiRoot);

        final CategoryResourceIdentifier categoryResourceIdentifier = category.toResourceIdentifier();
    }

    public void categoryToReference() {
        final Category category = createCategoryFromDraft(projectApiRoot);

        final CategoryReference categoryReference = category.toReference();
    }

    public void categorySetKeyUnset() {
        final Category category = createCategoryFromDraft(projectApiRoot);

        final Category updatedCategory = projectApiRoot.categories()
                .withId(category.getId())
                .post(CategoryUpdateBuilder.of()
                        .version(category.getVersion())
                        .actions(CategorySetKeyAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void categorySetCustomFieldUnset() {
        final Category category = createCategoryFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final Category updatedCategory = projectApiRoot.categories()
                .withId(category.getId())
                .post(CategoryUpdateBuilder.of()
                        .version(category.getVersion())
                        .actions(CategorySetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void categoryTreeFindById() {
        final String id = "test-id-" + UUID.randomUUID().toString();
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());

        final Category category = categoryTree.findById(id).get();
    }

    public void categoryTreeFindBySlug() {
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());

        final Category category = categoryTree.findBySlug(Locale.ENGLISH, "category-slug").get();
    }

    public void categoryTreeFindByKey() {
        final String key = "test-key";
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());

        final Category category = categoryTree.findByKey(key).get();
    }

    public void categoryTreeFindByExternalId() {
        final String externalId = "test-external-id";
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());

        final Category category = categoryTree.findByExternalId(externalId).get();
    }

    public void categoryTreeGetRoots() {
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());

        final List<Category> categories = categoryTree.getRoots();
    }

    public void categoryTreeGetAllAsFlatList() {
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());

        final List<Category> categories = categoryTree.getAllAsFlatList();
    }

    public void categoryTreeFindChildren() {
        String id = "0";
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());
        final Category category = categoryTree.findById(id).get();

        final List<Category> categories = categoryTree.findChildren(category);
    }

    public void categoryTreeFindSiblings() {
        String id = "0";
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());
        final Category category = categoryTree.findById(id).get();

        final List<Category> categories = categoryTree.findSiblings(singletonList(category));
    }

    public void categoryTreeGetSubtreeRoots() {
        String id = "0";
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());

        final Category category = categoryTree.findById(id).get();
        final CategoryTree subtree = categoryTree.getSubtree(singletonList(category));

        final List<Category> subTreeRoots = subtree.getSubtreeRoots();
    }

    public void categoryTreeGetSubtree() {
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());

        final Category category0 = categoryTree.findById("0").get();
        final Category category1 = categoryTree.findById("1").get();

        final CategoryTree subtree = categoryTree.getSubtree(asList(category0, category1));
    }

    public void categoryTreeGetRootAncestor() {
        final CategoryTree categoryTree = CategoryTree.of(createCategoryHierarchy());

        final Category category = categoryTree.findById("0").get();

        final Category rootAncestor = categoryTree.getRootAncestor(category);
    }

    //Channel helper methods examples
    private Channel createChannelFromDraft(ProjectApiRoot projectApiRoot) {
        final ChannelDraft channelDraft = ChannelDraftBuilder.of()
                .key("test-key-" + UUID.randomUUID().toString())
                .name(LocalizedStringBuilder.of().addValue("en", "channel-name").build())
                .address(AddressBuilder.of().country("DE").build())
                .build();

        return projectApiRoot.channels().post(channelDraft).executeBlocking().getBody();
    }

    public void channelToResourceIdentifier() {
        final Channel channel = createChannelFromDraft(projectApiRoot);

        final ChannelResourceIdentifier channelResourceIdentifier = channel.toResourceIdentifier();
    }

    public void channelToReference() {
        final Channel channel = createChannelFromDraft(projectApiRoot);

        final ChannelReference channelReference = channel.toReference();
    }

    public void channelSetGeoLocationUnset() {
        final Channel channel = createChannelFromDraft(projectApiRoot);

        final Channel updatedChannel = projectApiRoot.channels()
                .withId(channel.getId())
                .post(ChannelUpdateBuilder.of()
                        .version(channel.getVersion())
                        .actions(ChannelSetGeoLocationAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void channelSetAddressCustomFieldUnset() {
        final Channel channel = createChannelFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final Channel updatedChannel = projectApiRoot.channels()
                .withId(channel.getId())
                .post(ChannelUpdateBuilder.of()
                        .version(channel.getVersion())
                        .actions(ChannelSetAddressCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void channelSetCustomFieldUnset() {
        final Channel channel = createChannelFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final Channel updatedChannel = projectApiRoot.channels()
                .withId(channel.getId())
                .post(ChannelUpdateBuilder.of()
                        .version(channel.getVersion())
                        .actions(ChannelSetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    // Custom Objects helper methods examples
    private CustomObject createCustomObjectFromDraft(ProjectApiRoot projectApiRoot) {
        final CustomObjectDraft customObjectDraft = CustomObjectDraftBuilder.of()
                .key("test-key-" + UUID.randomUUID().toString())
                .container("containerTest")
                .build();

        return projectApiRoot.customObjects().post(customObjectDraft).executeBlocking().getBody();
    }

    public void customObjectToReference() {
        final CustomObject customObject = createCustomObjectFromDraft(projectApiRoot);

        final CustomObjectReference customObjectReference = customObject.toReference();
    }

    // Customer helper methods examples
    private Customer createCustomerFromDraft(ProjectApiRoot projectApiRoot) {
        final CustomerDraft customerDraft = CustomerDraftBuilder.of()
                .key("test-key-" + UUID.randomUUID().toString())
                .email("test@example.com")
                .password("Password")
                .build();

        return (Customer) projectApiRoot.customers().post(customerDraft).executeBlocking().getBody();
    }

    public void customerResourceIdentifier() {
        final Customer customer = createCustomerFromDraft(projectApiRoot);

        final CustomerResourceIdentifier customerResourceIdentifier = customer.toResourceIdentifier();
    }

    public void customerToReference() {
        final Customer customer = createCustomerFromDraft(projectApiRoot);

        final CustomerReference customerReference = customer.toReference();
    }

    public void customerDraftBuilderFromCustomer() {
        final Customer customer = createCustomerFromDraft(projectApiRoot);

        final CustomerDraftBuilder customerDraftBuilder = CustomerDraft.builder(customer);
    }

    public void customerSetAddressCustomFieldUnset() {
        final Customer customer = createCustomerFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final Customer updatedCustomer = projectApiRoot.customers()
                .withId(customer.getId())
                .post(CustomerUpdateBuilder.of()
                        .version(customer.getVersion())
                        .actions(CustomerSetAddressCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void customerSetCustomFieldUnset() {
        final Customer customer = createCustomerFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final Customer updatedCustomer = projectApiRoot.customers()
                .withId(customer.getId())
                .post(CustomerUpdateBuilder.of()
                        .version(customer.getVersion())
                        .actions(CustomerSetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void customerSetKeyUnset() {
        final Customer customer = createCustomerFromDraft(projectApiRoot);

        final Customer updatedCustomer = projectApiRoot.customers()
                .withId(customer.getId())
                .post(CustomerUpdateBuilder.of()
                        .version(customer.getVersion())
                        .actions(CustomerSetKeyAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    // Customer Group helper methods examples

    private CustomerGroup createCustomerGroupFromDraft(ProjectApiRoot projectApiRoot) {
        final CustomerGroupDraft customerGroupDraft = CustomerGroupDraftBuilder.of()
                .key("test-key-" + UUID.randomUUID().toString())
                .groupName("test-group-name")
                .build();

        return projectApiRoot.customerGroups().post(customerGroupDraft).executeBlocking().getBody();
    }

    public void customerGroupResourceIdentifier() {
        final CustomerGroup customerGroup = createCustomerGroupFromDraft(projectApiRoot);

        final CustomerGroupResourceIdentifier customerGroupResourceIdentifier = customerGroup.toResourceIdentifier();
    }

    public void customerGroupToReference() {
        final CustomerGroup customerGroup = createCustomerGroupFromDraft(projectApiRoot);

        final CustomerGroupReference customerGroupReference = customerGroup.toReference();
    }

    public void customerGroupSetKeyUnset() {
        final CustomerGroup customerGroup = createCustomerGroupFromDraft(projectApiRoot);

        final CustomerGroup updatedCustomerGroup = projectApiRoot.customerGroups()
                .withId(customerGroup.getId())
                .post(CustomerGroupUpdateBuilder.of()
                        .version(customerGroup.getVersion())
                        .actions(CustomerGroupSetKeyAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void customerGroupSetCustomFieldUnset() {
        final CustomerGroup customerGroup = createCustomerGroupFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final CustomerGroup updatedCustomerGroup = projectApiRoot.customerGroups()
                .withId(customerGroup.getId())
                .post(CustomerGroupUpdateBuilder.of()
                        .version(customerGroup.getVersion())
                        .actions(CustomerGroupSetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    // Discount Code helper methods examples

    private DiscountCode createDiscountCodeFromDraft(ProjectApiRoot projectApiRoot) {
        final DiscountCodeDraft discountCodeDraft = DiscountCodeDraftBuilder.of()
                .name(LocalizedStringBuilder.of().addValue("en", "discount-code-name").build())
                .isActive(true)
                .maxApplications(1000L)
                .maxApplicationsPerCustomer(1L)
                .build();

        return projectApiRoot.discountCodes().post(discountCodeDraft).executeBlocking().getBody();
    }

    public void discountCodeResourceIdentifier() {
        final DiscountCode discountCode = createDiscountCodeFromDraft(projectApiRoot);

        final DiscountCodeResourceIdentifier cdiscountCodeResourceIdentifier = discountCode.toResourceIdentifier();
    }

    public void discountCodeToReference() {
        final DiscountCode discountCode = createDiscountCodeFromDraft(projectApiRoot);

        final DiscountCodeReference discountCodeReference = discountCode.toReference();
    }

    public void discountCodeSetCustomFieldUnset() {
        final DiscountCode discountCode = createDiscountCodeFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final DiscountCode updatedDiscountCode = projectApiRoot.discountCodes()
                .withId(discountCode.getId())
                .post(DiscountCodeUpdateBuilder.of()
                        .version(discountCode.getVersion())
                        .actions(DiscountCodeSetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    // Extension helper methods examples

    private Extension createExtensionFromDraft(ProjectApiRoot projectApiRoot) {
        final ExtensionDraft extensionDraft = ExtensionDraftBuilder.of()
                .key("test-key-" + UUID.randomUUID().toString())
                .destination(AWSLambdaDestinationBuilder.of().build())
                .build();

        return projectApiRoot.extensions().post(extensionDraft).executeBlocking().getBody();
    }

    public void extensionSetKeyUnset() {
        final Extension extension = createExtensionFromDraft(projectApiRoot);

        final Extension updatedExtension = projectApiRoot.extensions()
                .withId(extension.getId())
                .post(ExtensionUpdateBuilder.of()
                        .version(extension.getVersion())
                        .actions(ExtensionSetKeyAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    // Inventory helper methods examples

    private InventoryEntry createInventoryFromDraft(ProjectApiRoot projectApiRoot) {
        final InventoryEntryDraft inventoryDraft = InventoryEntryDraftBuilder.of()
                .key("test-key-" + UUID.randomUUID().toString())
                .sku("test-sku-" + UUID.randomUUID().toString())
                .quantityOnStock(100L)
                .build();

        return projectApiRoot.inventory().post(inventoryDraft).executeBlocking().getBody();
    }

    public void inventoryResourceIdentifier() {
        final InventoryEntry inventoryEntry = createInventoryFromDraft(projectApiRoot);

        final InventoryEntryResourceIdentifier inventoryEntryResourceIdentifier = inventoryEntry.toResourceIdentifier();
    }

    public void inventoryToReference() {
        final InventoryEntry inventoryEntry = createInventoryFromDraft(projectApiRoot);

        final InventoryEntryReference inventoryEntryReference = inventoryEntry.toReference();
    }

    public void inventorySetKeyUnset() {
        final InventoryEntry inventoryEntry = createInventoryFromDraft(projectApiRoot);

        final InventoryEntry updatedInventoryEntry = projectApiRoot.inventory()
                .withId(inventoryEntry.getId())
                .post(InventoryEntryUpdateBuilder.of()
                        .version(inventoryEntry.getVersion())
                        .actions(InventoryEntrySetKeyAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void inventorySetCustomFieldUnset() {
        final InventoryEntry inventoryEntry = createInventoryFromDraft(projectApiRoot);

        final String name = "test-name-" + UUID.randomUUID().toString();
        final InventoryEntry updatedInventoryEntry = projectApiRoot.inventory()
                .withId(inventoryEntry.getId())
                .post(InventoryEntryUpdateBuilder.of()
                        .version(inventoryEntry.getVersion())
                        .actions(InventoryEntrySetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    // Common folder
    // MoneyUtil helper methods examples

    public void moneyToMonetaryAmount() {
        final Money money = MoneyBuilder.of().currencyCode("EUR").centAmount(100L).build();
        final MonetaryAmount monetaryAmount = MoneyUtil.toMonetaryAmount(money);
    }

    public void typedMoneyDraftToMonetaryAmount() {
        final TypedMoneyDraft typedMoneyDraft = TypedMoneyDraftBuilder.of()
                .centPrecisionBuilder()
                .centAmount(100L)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount monetaryAmount = MoneyUtil.toMonetaryAmount(typedMoneyDraft);
    }

    public void centPrecisionMoneyDraftToMonetaryAmount() {
        final CentPrecisionMoneyDraft centPrecisionMoneyDraft = CentPrecisionMoneyDraftBuilder.of()
                .fractionDigits(2)
                .centAmount(100L)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount monetaryAmount = MoneyUtil.toMonetaryAmount(centPrecisionMoneyDraft);
    }

    public void highPrecisionMoneyDraftToMonetaryAmount() {
        final HighPrecisionMoneyDraft highPrecisionMoneyDraft = HighPrecisionMoneyDraftBuilder.of()
                .preciseAmount(100L)
                .fractionDigits(2)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount monetaryAmount = MoneyUtil.toMonetaryAmount(highPrecisionMoneyDraft);
    }

    public void typedMoneyToMonetaryAmount() {
        final TypedMoney typedMoney = TypedMoneyBuilder.of()
                .highPrecisionBuilder()
                .fractionDigits(2)
                .preciseAmount(100L)
                .centAmount(100L)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount monetaryAmount = MoneyUtil.toMonetaryAmount(typedMoney);
    }

    public void centPrecisionMoneyToMonetaryAmount() {
        final CentPrecisionMoney centPrecisionMoney = CentPrecisionMoneyBuilder.of()
                .fractionDigits(2)
                .centAmount(100L)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount monetaryAmount = MoneyUtil.toMonetaryAmount(centPrecisionMoney);
    }

    public void highPrecisionMoneyToMonetaryAmount() {
        final HighPrecisionMoney highPrecisionMoney = HighPrecisionMoneyBuilder.of()
                .preciseAmount(100L)
                .fractionDigits(2)
                .centAmount(100L)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount monetaryAmount = MoneyUtil.toMonetaryAmount(highPrecisionMoney);
    }

    public void zeroAmountString() {
        final MonetaryAmount zeroAmount = MoneyUtil.zeroAmount("EUR");
    }

    public void zeroAmountStringCurrencyUnit() {
        final CurrencyUnit currencyUnit = CurrencyUnitBuilder.of("EUR", "").build();
        final MonetaryAmount zeroAmount = MoneyUtil.zeroAmount(currencyUnit);
    }

    public void ofMonetaryAmount() {
        CentPrecisionMoney centMoney = MoneyUtil.of(FastMoney.of(1.000, "EUR"));
    }

    public void ofMonetaryAmountAndInt() {
        HighPrecisionMoney highMoney = MoneyUtil.of(FastMoney.of(1.0010, "EUR"), 3);
    }

    public void draftOfMonetaryAmount() {
        CentPrecisionMoneyDraft centMoneyDraft = MoneyUtil.draftOf(FastMoney.of(1.000, "EUR"));
    }

    public void draftOfMonetaryAmountAndInt() {
        HighPrecisionMoneyDraft highMoneyDraft = MoneyUtil.draftOf(FastMoney.of(1.0010, "EUR"), 3);
    }

    public void amountToCents() {
        final MonetaryAmount monetaryAmount = org.javamoney.moneta.Money.of(10.00501, "EUR");
        final Long cents = MoneyUtil.amountToCents(monetaryAmount);
    }

    public void amountToPreciseAmount() {
        final MonetaryAmount highEur = org.javamoney.moneta.Money.of(10.00501, "EUR");
        final Long preciseAmount = MoneyUtil.amountToPreciseAmount(highEur, 3);
    }

    public void calculatesAppliedTaxes() {
        final CentPrecisionMoney totalNet = CentPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .currencyCode("EUR")
                .fractionDigits(2)
                .build();
        final CentPrecisionMoney totalGross = CentPrecisionMoneyBuilder.of()
                .centAmount(119L)
                .currencyCode("EUR")
                .fractionDigits(2)
                .build();
        final TaxedItemPrice taxedItemPrice = TaxedItemPriceBuilder.of()
                .totalNet(totalNet)
                .totalGross(totalGross)
                .build();
        final MonetaryAmount appliedTaxes = MoneyUtil.calculateAppliedTaxes(taxedItemPrice);
    }

    public void calculateGrossPrice() {
        final TaxRate taxRate = TaxRateBuilder.of()
                .amount(0.19)
                .country("DE")
                .name("test-foo")
                .includedInPrice(true)
                .build();
        final CentPrecisionMoney centPrecisionMoney = CentPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .fractionDigits(2)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount amount = centPrecisionMoney.toMonetaryAmount();
        final MonetaryAmount grossPrice = MoneyUtil.calculateGrossPrice(amount, taxRate);
    }

    public void calculateNetPrice() {
        final TaxRate taxRate = TaxRateBuilder.of()
                .amount(0.19)
                .country("DE")
                .name("test-foo")
                .includedInPrice(true)
                .build();
        final CentPrecisionMoney centPrecisionMoney = CentPrecisionMoneyBuilder.of()
                .centAmount(119L)
                .fractionDigits(2)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount amount = centPrecisionMoney.toMonetaryAmount();
        final MonetaryAmount netPrice = MoneyUtil.calculateNetPrice(amount, taxRate);
    }

    public void convertNetToGross() {
        final MonetaryAmount netAmount = CentPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .fractionDigits(2)
                .currencyCode("EUR")
                .build();
        final double taxRate = 0.19;
        final MonetaryAmount grossPrice = MoneyUtil.convertNetToGrossPrice(netAmount, taxRate);
    }

    public void convertGrossToNetPrice() {
        final MonetaryAmount grossAmount = CentPrecisionMoneyBuilder.of()
                .centAmount(119L)
                .fractionDigits(2)
                .currencyCode("EUR")
                .build();
        final double taxRate = 0.19;
        final MonetaryAmount netPrice = MoneyUtil.convertNetToGrossPrice(grossAmount, taxRate);
    }
}
