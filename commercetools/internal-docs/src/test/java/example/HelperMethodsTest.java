
package example;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;
import javax.money.MonetaryOperator;

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
import com.commercetools.api.models.order.*;
import com.commercetools.api.models.order_edit.*;
import com.commercetools.api.models.payment.*;
import com.commercetools.api.models.product.*;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.tax_category.TaxRateBuilder;

import org.javamoney.moneta.CurrencyUnitBuilder;
import org.javamoney.moneta.FastMoney;

// the scope of this class is to give the possibility to the JAvaDoc to get the related examples
public class HelperMethodsTest {
    ProjectApiRoot projectApiRoot;

    // Business Unit helper methods examples
    BusinessUnit businessUnit;

    public void businessUnitSetCustomFieldUnset() {
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
    Cart cart;

    // TODO to be added
    public void cartInventoryModeDefaultValue() {

    }

    public void cartToResourceIdentifier() {

        final CartResourceIdentifier cartResourceIdentifier = cart.toResourceIdentifier();
    }

    public void cartToReference() {
        final CartReference cartReference = cart.toReference();
    }

    public void cartSetLineItemCustomFieldUnset() {
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
        final Cart updatedCart = projectApiRoot.carts()
                .withId(cart.getId())
                .post(CartUpdateBuilder.of().version(cart.getVersion()).actions(CartSetKeyAction.ofUnset()).build())
                .executeBlocking()
                .getBody();
    }

    // Cart Discount helper methods examples
    CartDiscount cartDiscount;

    public void cartDiscountToResourceIdentifier() {
        final CartDiscountResourceIdentifier cartDiscountResourceIdentifier = cartDiscount.toResourceIdentifier();
    }

    public void cartDiscountToReference() {
        final CartDiscountReference cartDiscountReference = cartDiscount.toReference();
    }

    public void cartDiscountSetCustomFieldUnset() {
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
    Category category;

    private List<Category> createCategoryHierarchy() {
        final List<String> rootIds = asList("0", "1", "2", "3");
        final List<String> childIds = asList("a", "b", "c", "d", "e");
        final List<String> grandchildIds = asList("u", "v", "w", "x");

        final List<Category> rootCategories = rootIds.stream()
                .map(id -> CategoryBuilder.of(category).build())
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
        final CategoryResourceIdentifier categoryResourceIdentifier = category.toResourceIdentifier();
    }

    public void categoryToReference() {
        final CategoryReference categoryReference = category.toReference();
    }

    public void categorySetKeyUnset() {
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
    Channel channel;

    public void channelToResourceIdentifier() {
        final ChannelResourceIdentifier channelResourceIdentifier = channel.toResourceIdentifier();
    }

    public void channelToReference() {
        final ChannelReference channelReference = channel.toReference();
    }

    public void channelSetGeoLocationUnset() {
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

    // Common folder

    // BaseAddress helper methods examples

    public void toAddressDraft() {
        final Address address = AddressBuilder.of()
                .key("address-key")
                .country("DE")
                .id("address-id")
                .email("test@example.com")
                .firstName("adddress-firstName")
                .build();

        final AddressDraft addressDraft = address.toDraft();
    }

    public void toAddressDraftBuilder() {
        final Address address = AddressBuilder.of()
                .key("address-key")
                .country("DE")
                .id("address-id")
                .email("test@example.com")
                .firstName("adddress-firstName")
                .build();

        final AddressDraftBuilder addressDraftBuilder = address.toDraftBuilder();
    }

    public void equalsIgnoreId() {
        final Address address1 = Address.builder().id("123").country("DE").build();
        final Address address2 = Address.builder().id("234").country("DE").build();

        final boolean equalsAddressIgnoringId = address1.equalsIgnoreId(address2);
    }

    //CentPrecisionMoney
    public void toCentPrecisionMoneyDraft() {
        final CentPrecisionMoney centPrecisionMoney = CentPrecisionMoneyBuilder.of()
                .fractionDigits(2)
                .centAmount(100L)
                .currencyCode("EUR")
                .build();

        final CentPrecisionMoneyDraft centPrecisionMoneyDraft = centPrecisionMoney.toDraft();
    }

    //HighPrecisionMoney
    public void toHighPrecisionMoneyDraft() {
        final HighPrecisionMoney highPrecisionMoney = HighPrecisionMoneyBuilder.of()
                .fractionDigits(2)
                .centAmount(100L)
                .currencyCode("EUR")
                .build();

        final HighPrecisionMoneyDraft highPrecisionMoneyDraft = highPrecisionMoney.toDraft();
    }

    public void createMoneyOperator() {
        final HighPrecisionMoney highPrecisionMoney = HighPrecisionMoneyBuilder.of()
                .fractionDigits(2)
                .centAmount(100L)
                .currencyCode("EUR")
                .build();

        final MonetaryOperator monetaryOperator = highPrecisionMoney.createMoneyOperator();
    }

    public void createMoneyOperatorFromDraft() {
        final HighPrecisionMoneyDraft highPrecisionMoneyDraft = HighPrecisionMoneyDraftBuilder.of()
                .fractionDigits(2)
                .centAmount(100L)
                .currencyCode("EUR")
                .build();

        final MonetaryOperator monetaryOperator = highPrecisionMoneyDraft.createMoneyOperator();
    }

    //Typed Money

    public void createMoneyOperatorTypedMoney() {
        final TypedMoney typedMoney = TypedMoneyBuilder.of()
                .centPrecisionBuilder()
                .centAmount(100L)
                .currencyCode("EUR")
                .build();

        final MonetaryOperator monetaryOperator = typedMoney.createMoneyOperator();
    }

    public void createMoneyOperatorFromTypedMoneyDraft() {
        final TypedMoneyDraft typedMoneyDraft = TypedMoneyDraftBuilder.of()
                .centPrecisionBuilder()
                .centAmount(100L)
                .currencyCode("EUR")
                .build();

        final MonetaryOperator monetaryOperator = typedMoneyDraft.createMoneyOperator();
    }

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

    // Custom Objects helper methods examples

    CustomObject customObject;

    public void customObjectToReference() {
        final CustomObjectReference customObjectReference = customObject.toReference();
    }

    // Customer helper methods examples
    Customer customer;

    public void customerResourceIdentifier() {
        final CustomerResourceIdentifier customerResourceIdentifier = customer.toResourceIdentifier();
    }

    public void customerToReference() {
        final CustomerReference customerReference = customer.toReference();
    }

    public void customerDraftBuilderFromCustomer() {
        final CustomerDraftBuilder customerDraftBuilder = CustomerDraft.builder(customer);
    }

    public void customerSetAddressCustomFieldUnset() {
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
    CustomerGroup customerGroup;

    public void customerGroupResourceIdentifier() {
        final CustomerGroupResourceIdentifier customerGroupResourceIdentifier = customerGroup.toResourceIdentifier();
    }

    public void customerGroupToReference() {
        final CustomerGroupReference customerGroupReference = customerGroup.toReference();
    }

    public void customerGroupSetKeyUnset() {
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
    DiscountCode discountCode;

    public void discountCodeResourceIdentifier() {
        final DiscountCodeResourceIdentifier cdiscountCodeResourceIdentifier = discountCode.toResourceIdentifier();
    }

    public void discountCodeToReference() {
        final DiscountCodeReference discountCodeReference = discountCode.toReference();
    }

    public void discountCodeSetCustomFieldUnset() {
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

    Extension extension;

    public void extensionSetKeyUnset() {
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

    InventoryEntry inventoryEntry;

    public void inventoryResourceIdentifier() {
        final InventoryEntryResourceIdentifier inventoryEntryResourceIdentifier = inventoryEntry.toResourceIdentifier();
    }

    public void inventoryToReference() {
        final InventoryEntryReference inventoryEntryReference = inventoryEntry.toReference();
    }

    public void inventorySetKeyUnset() {
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

    // Order helper methods examples

    Order order;

    public void orderResourceIdentifier() {
        final OrderResourceIdentifier orderResourceIdentifier = order.toResourceIdentifier();
    }

    public void orderToReference() {
        final OrderReference orderReference = order.toReference();
    }

    public void calculateSubTotalPrice() {
        Cart cart = CartBuilder.of()
                .totalPrice(CentPrecisionMoneyBuilder.of().centAmount(0L).fractionDigits(2).currencyCode("EUR").build())
                .lineItems(Collections.emptyList())
                .customLineItems(Collections.emptyList())
                .buildUnchecked();

        final MonetaryAmount subTotal = cart.calculateSubTotalPrice();
    }

    public void toParcelDraft() {
        final Parcel parcel = ParcelBuilder.of().id("parcel-id").build();

        final ParcelDraft parcelDraft = parcel.toDraft();
    }

    public void toParcelDraftBuilder() {
        final Parcel parcel = ParcelBuilder.of().id("parcel-id").build();

        final ParcelDraftBuilder parcelDraftBuilder = parcel.toDraftBuilder();
    }

    public void toDeliveryDraft() {
        final Delivery delivery = DeliveryBuilder.of().id("delivery-id").build();

        final DeliveryDraft deliveryDraft = delivery.toDraft();
    }

    public void toDeliveryDraftBuilder() {
        final Delivery delivery = DeliveryBuilder.of().id("delivery-id").build();

        final DeliveryDraftBuilder deliveryDraftBuilder = delivery.toDraftBuilder();
    }

    public void orderSetDeliveryAddressUnset() {
        final String deliveryId = "test-deliveryId-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetDeliveryAddressAction.ofUnset(deliveryId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderSetLineItemCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String lineItemId = "test-lineItemId-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetLineItemCustomFieldAction.ofUnset(name, lineItemId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderSetCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderSetBillingAddressCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetBillingAddressCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderSetCustomLineItemCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String customLineItemId = "test-customLineItemId-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetCustomLineItemCustomFieldAction.ofUnset(name, customLineItemId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderSetDeliveryAddressCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String deliveryId = "test-deliveryId-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetDeliveryAddressCustomFieldAction.ofUnset(name, deliveryId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderSetItemShippingAddressCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String addressKey = "test-addressKey-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetItemShippingAddressCustomFieldAction.ofUnset(name, addressKey))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderSetShippingAddressCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetShippingAddressCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderSetParcelCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String parcelId = "test-parcelId-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetParcelCustomFieldAction.ofUnset(name, parcelId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderSetReturnItemCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String returnItemId = "test-returnItemId-" + UUID.randomUUID().toString();
        final Order updatedOrder = projectApiRoot.orders()
                .withId(order.getId())
                .post(OrderUpdateBuilder.of()
                        .version(order.getVersion())
                        .actions(OrderSetReturnItemCustomFieldAction.ofUnset(name, returnItemId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void getOrderByCustomerId() {
        final OrderPagedQueryResponse orderPagedQueryResponse = projectApiRoot.orders()
                .get()
                .byCustomerId(order.getCustomerId())
                .executeBlocking()
                .getBody();
    }

    public void getOrderByCustomerEmail() {
        final OrderPagedQueryResponse orderPagedQueryResponse = projectApiRoot.orders()
                .get()
                .byCustomerEmail(order.getCustomerEmail())
                .executeBlocking()
                .getBody();
    }

    // Order Edit helper methods examples

    OrderEdit orderEdit;

    public void orderEditResourceIdentifier() {
        final OrderEditResourceIdentifier orderEditResourceIdentifier = orderEdit.toResourceIdentifier();
    }

    public void orderEditToReference() {
        final OrderEditReference orderEditReference = orderEdit.toReference();
    }

    public void orderEditSetKeyUnset() {
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditSetKeyAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditSetCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditSetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetShippingRateInputUnset() {
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(StagedOrderSetShippingRateInputAction.ofUnset())
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetDeliveryAddressInputUnset() {
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(StagedOrderSetDeliveryAddressAction.ofUnset())
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetLineItemCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String lineItemId = "test-lineItemId-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(StagedOrderSetLineItemCustomFieldAction.ofUnset(name, lineItemId))
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetCustomLineItemCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String customLineItemId = "test-customLineItemId-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(
                                    StagedOrderSetCustomLineItemCustomFieldAction.ofUnset(name, customLineItemId))
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetDeliveryAddressCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String deliveryId = "test-deliveryId-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(StagedOrderSetDeliveryAddressCustomFieldAction.ofUnset(name, deliveryId))
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetItemShippingAddressCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String addressKey = "test-addressKey-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(
                                    StagedOrderSetItemShippingAddressCustomFieldAction.ofUnset(name, addressKey))
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetShippingAddressCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(StagedOrderSetShippingAddressCustomFieldAction.ofUnset(name))
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetDeliveryCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String deliveryId = "test-deliveryId-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(StagedOrderSetDeliveryCustomFieldAction.ofUnset(name, deliveryId))
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetParcelCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String parcelId = "test-parcelId-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(StagedOrderSetParcelCustomFieldAction.ofUnset(name, parcelId))
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetReturnItemCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String returnItemId = "test-returnItemId-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(StagedOrderSetReturnItemCustomFieldAction.ofUnset(name, returnItemId))
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void orderEditStagedOrderSetCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final OrderEdit updatedOrderEdit = projectApiRoot.orders()
                .edits()
                .withId(orderEdit.getId())
                .post(OrderEditUpdateBuilder.of()
                        .version(orderEdit.getVersion())
                        .actions(OrderEditUpdateAction.addStagedActionBuilder()
                                .stagedAction(StagedOrderSetCustomFieldAction.ofUnset(name))
                                .build())
                        .build())
                .executeBlocking()
                .getBody();
    }

    // Payment helper methods examples

    Payment payment;

    public void paymentResourceIdentifier() {
        final PaymentResourceIdentifier paymentResourceIdentifier = payment.toResourceIdentifier();
    }

    public void paymentToReference() {
        final PaymentReference paymentReference = payment.toReference();
    }

    public void paymentSetTransactionCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final String transactionId = "test-transactionId-" + UUID.randomUUID().toString();
        final Payment updatedPayment = projectApiRoot.payments()
                .withId(payment.getId())
                .post(PaymentUpdateBuilder.of()
                        .version(payment.getVersion())
                        .actions(PaymentSetTransactionCustomFieldAction.ofUnset(name, transactionId))
                        .build())
                .executeBlocking()
                .getBody();
    }

    public void paymentSetCustomFieldUnset() {
        final String name = "test-name-" + UUID.randomUUID().toString();
        final Payment updatedPayment = projectApiRoot.payments()
                .withId(payment.getId())
                .post(PaymentUpdateBuilder.of()
                        .version(payment.getVersion())
                        .actions(PaymentSetCustomFieldAction.ofUnset(name))
                        .build())
                .executeBlocking()
                .getBody();
    }

    // Product helper methods examples
    Product product;
    ProductProjection productProjectionStaged;

    public void productResourceIdentifier() {
        final ProductResourceIdentifier productResourceIdentifier = product.toResourceIdentifier();
    }

    public void productToReference() {
        final ProductReference productReference = product.toReference();
    }

    public void productFindVariantBySku() {
        ProductProjection productProjection = ProductProjectionBuilder.of()
                .masterVariant(product.getMasterData().getStaged().getMasterVariant())
                .build();

        Optional<ProductVariant> productVariant = productProjection.findVariantBySku("sku-test");
    }

    public void productGetVariantOrMaster() {
        ProductVariant productVariant = product.getMasterData().getCurrent().getVariantOrMaster(111111L);
    }

    public void productGetVariant() {
        ProductProjection productProjection = ProductProjectionBuilder.of()
                .masterVariant(product.getMasterData().getStaged().getMasterVariant())
                .build();

        Optional<ProductVariant> productVariant = Optional.ofNullable(
            productProjection.getVariant(product.getMasterData().getCurrent().getVariants().get(0).getId()));
    }

    public void productByIdVariantIdentifierOf() {
        final LineItem lineItem = LineItemBuilder.of()
                .productId(product.getId())
                .name(LocalizedStringBuilder.of().build())
                .build();

        final ByIdVariantIdentifier byIdVariantIdentifier = ByIdVariantIdentifier.of(lineItem.getProductId(),
            lineItem.getVariant().getId());
    }

    public void productByIdVariantIdentifierOfWithReferencable() {
        final LineItem lineItem = LineItemBuilder.of()
                .productId(product.getId())
                .name(LocalizedStringBuilder.of().build())
                .build();

        final ByIdVariantIdentifier byIdVariantIdentifier = ByIdVariantIdentifier.of(product,
            lineItem.getVariant().getId());
    }

    public void productBySkuVariantIdentifierOf() {
        final LineItem lineItem = LineItemBuilder.of()
                .productId(product.getId())
                .variant(ProductVariantBuilder.of().sku("test-sku").build())
                .name(LocalizedStringBuilder.of().build())
                .build();

        final BySkuVariantIdentifier bySkuVariantIdentifier = BySkuVariantIdentifier.of(lineItem.getVariant().getSku());
    }

    public void productProjectionFindVariant() {
        Optional<ProductVariant> productVariant = productProjectionStaged.findVariant(
            Objects.requireNonNull(product.getMasterData().getStaged().getMasterVariant().getIdentifier()));
    }

    public void productProjectionFindMatchingVariants() {
        Optional<ProductVariant> productVariant = productProjectionStaged.findMatchingVariants()
                .stream()
                .filter(variant -> variant.hasAttribute("size-attribute"))
                .findFirst();
    }

    public void productProjectionFindFirstMatchingVariants() {
        Optional<ProductVariant> productVariant = productProjectionStaged.findFirstMatchingVariant()
                .filter(variant -> variant.hasAttribute("size-attribute"));
    }

    public void productSetKeyUnset() {
        final Payment updatedPayment = projectApiRoot.payments()
                .withId(payment.getId())
                .post(PaymentUpdateBuilder.of()
                        .version(payment.getVersion())
                        .actions(PaymentSetKeyAction.ofUnset())
                        .build())
                .executeBlocking()
                .getBody();
    }

}
