
package commercetools.product_type;

import static commercetools.utils.CommercetoolsTestUtils.asSet;
import static commercetools.utils.CommercetoolsTestUtils.randomSlug;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static java.util.Locale.*;
import static java.util.stream.Collectors.*;
import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;
import java.util.*;

import javax.annotation.concurrent.NotThreadSafe;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.error.ErrorResponseException;
import com.commercetools.api.models.common.*;
import com.commercetools.api.models.error.InvalidFieldError;
import com.commercetools.api.models.order.*;
import com.commercetools.api.models.product.*;
import com.commercetools.api.models.product_type.*;
import commercetools.product.ProductFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import commercetools.utils.TestUtils;

import io.vrap.rmf.base.client.utils.json.JsonException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@NotThreadSafe
public class ProductTypeCreationDemoIntegrationTest {

    private static final String PRODUCT_TYPE_NAME = "tshirt-product-attribute-tutorial";
    private static final String BOOK_PRODUCT_TYPE_NAME = "book-product-attribute-tutorial";
    private static final String COLOR_ATTR_NAME = "AttributeTutorialColor";
    private static final String SIZE_ATTR_NAME = "AttributeTutorialSize";
    private static final String MATCHING_PRODUCTS_ATTR_NAME = "AttributeTutorialMatchingProducts";
    private static final String LAUNDRY_SYMBOLS_ATTR_NAME = "AttributeTutorialLaundrySymbols";
    private static final String RRP_ATTR_NAME = "AttributeTutorialRrp";
    private static final String AVAILABLE_SINCE_ATTR_NAME = "AttributeTutorialAvailableSince";
    private static final String ISBN_ATTR_NAME = "AttributeTutorialIsbn";

    public ProductType fetchProductTypeByName() {
        final Optional<ProductType> productTypeOptional = CommercetoolsTestUtils.getProjectApiRoot()
                .productTypes()
                .get()
                .addQuery(p -> p.name().is(PRODUCT_TYPE_NAME))
                .executeBlocking()
                .getBody()
                .head();
        final ProductType productType = productTypeOptional
                .orElseThrow(() -> new RuntimeException("product type " + PRODUCT_TYPE_NAME + " is not present."));
        //end example parsing here
        return productType;
    }

    @AfterAll
    @BeforeAll
    public static void deleteProductsAndProductType() {
        ProjectApiRoot apiRoot = CommercetoolsTestUtils.getProjectApiRoot();
        final List<ProductType> productTypes = apiRoot.productTypes()
                .get()
                .addQuery(p -> p.name().is(PRODUCT_TYPE_NAME))
                .executeBlocking()
                .getBody()
                .getResults();
        if (!productTypes.isEmpty()) {
            apiRoot.products()
                    .get()
                    .addQuery(p -> p.productType(t -> t.id().isInVar("typeId")),
                        Collections.singletonMap("typeId",
                            productTypes.stream().map(ProductType::getId).collect(toList())))
                    .executeBlocking()
                    .getBody()
                    .getResults()
                    .forEach(product -> apiRoot.products().delete(product));
            productTypes.forEach(p -> apiRoot.productTypes().delete(p));
        }
    }

    @BeforeAll
    public static void createBookProductType() throws Exception {
        final AttributeDefinitionDraft isbn = AttributeDefinitionDraft.builder()
                .type(AttributeTextType.of())
                .name(ISBN_ATTR_NAME)
                .label(LocalizedString.ofEnglish("ISBN"))
                .isRequired(false)
                .build();

        final ProductType productType = CommercetoolsTestUtils.getProjectApiRoot()
                .productTypes()
                .create(b -> b.key(CommercetoolsTestUtils.randomKey())
                        .name(BOOK_PRODUCT_TYPE_NAME)
                        .description("books")
                        .plusAttributes(isbn))
                .executeBlocking()
                .getBody();
    }

    @BeforeAll
    public static void createProductType() throws Exception {
        final AttributeLocalizedEnumValue green = AttributeLocalizedEnumValue.builder()
                .key("green")
                .label(LocalizedString.ofEnglish("green").plus(GERMAN, "grün"))
                .build();
        final AttributeLocalizedEnumValue red = AttributeLocalizedEnumValue.builder()
                .key("red")
                .label(LocalizedString.of(ENGLISH, "red").plus(GERMAN, "rot"))
                .build();
        final AttributeDefinitionDraft color = AttributeDefinitionDraft.builder()
                .name(COLOR_ATTR_NAME)
                .label(LocalizedString.ofEnglish("color"))
                .type(AttributeLocalizedEnumType.builder().plusValues(red, green).build())
                .isRequired(true)
                .build();

        final AttributePlainEnumValue s = AttributePlainEnumValue.builder().key("S").label("S").build();
        final AttributePlainEnumValue m = AttributePlainEnumValue.builder().key("M").label("M").build();
        final AttributePlainEnumValue x = AttributePlainEnumValue.builder().key("X").label("X").build();
        final AttributeDefinitionDraft size = AttributeDefinitionDraft.builder()
                .name(SIZE_ATTR_NAME)
                .label(LocalizedString.ofEnglish("size"))
                .type(AttributeEnumType.builder().plusValues(s, m, x).build())
                .isRequired(true)
                .build();

        final AttributeLocalizedEnumValue cold = AttributeLocalizedEnumValue.builder()
                .key("cold")
                .label(LocalizedString.of(ENGLISH, "Wash at or below 30°C ").plus(GERMAN, "30°C"))
                .build();
        final AttributeLocalizedEnumValue hot = AttributeLocalizedEnumValue.builder()
                .key("hot")
                .label(LocalizedString.of(ENGLISH, "Wash at or below 60°C ").plus(GERMAN, "60°C"))
                .build();
        final AttributeLocalizedEnumValue tumbleDrying = AttributeLocalizedEnumValue.builder()
                .key("tumbleDrying")
                .label(LocalizedString.of(ENGLISH, "tumble drying").plus(GERMAN, "Trommeltrocknen"))
                .build();
        final AttributeLocalizedEnumValue noTumbleDrying = AttributeLocalizedEnumValue.builder()
                .key("noTumbleDrying")
                .label(
                    LocalizedString.of(ENGLISH, "no tumble drying").plus(GERMAN, "Nicht im Trommeltrockner trocknen"))
                .build();
        final AttributeSetType laundryLabelType = AttributeSetType.builder()
                .elementType(
                    AttributeLocalizedEnumType.builder().plusValues(cold, hot, tumbleDrying, noTumbleDrying).build())
                .build();
        final AttributeDefinitionDraft laundrySymbols = AttributeDefinitionDraft.builder()
                .type(laundryLabelType)
                .name(LAUNDRY_SYMBOLS_ATTR_NAME)
                .label(LocalizedString.ofEnglish("washing labels"))
                .isRequired(false)
                .build();

        final AttributeDefinitionDraft matchingProducts = AttributeDefinitionDraft.builder()
                .name(MATCHING_PRODUCTS_ATTR_NAME)
                .label(LocalizedString.ofEnglish("matching products"))
                .type(AttributeSetType.builder()
                        .elementType(
                            AttributeReferenceType.builder().referenceTypeId(AttributeReferenceTypeId.PRODUCT).build())
                        .build())
                .isRequired(false)
                .build();

        final AttributeDefinitionDraft rrp = AttributeDefinitionDraft.builder()
                .name(RRP_ATTR_NAME)
                .label(LocalizedString.ofEnglish("recommended retail price"))
                .type(AttributeMoneyType.of())
                .isRequired(false)
                .build();

        final AttributeDefinitionDraft availableSince = AttributeDefinitionDraft.builder()
                .name(AVAILABLE_SINCE_ATTR_NAME)
                .label(LocalizedString.ofEnglish("available since"))
                .type(AttributeDateType.of())
                .isRequired(false)
                .build();

        final List<AttributeDefinitionDraft> attributes = asList(color, size, laundrySymbols, matchingProducts, rrp,
            availableSince);
        final ProductTypeDraft productTypeDraft = ProductTypeDraft.builder()
                .key(CommercetoolsTestUtils.randomKey())
                .name(PRODUCT_TYPE_NAME)
                .description("a 'T' shaped cloth")
                .attributes(attributes)
                .build();
        final ProductType productType = CommercetoolsTestUtils.getProjectApiRoot()
                .productTypes()
                .post(productTypeDraft)
                .executeBlocking()
                .getBody();
    }

    @Test
    public void productCreation() throws Exception {
        createProduct();
    }

    public Product createProduct() throws Exception {
        final ProductType productType = fetchProductTypeByName();
        final ProductReference similarProductReference = ProductFixtures
                .referenceableProduct(CommercetoolsTestUtils.getProjectApiRoot())
                .toReference();
        final ProductVariantDraft masterVariantDraft = ProductVariantDraft.builder()
                .plusAttributes(b -> b.name(COLOR_ATTR_NAME).value("green")) //special case: any enums are set with key (String)
                .plusAttributes(b -> b.name(SIZE_ATTR_NAME).value("S"))//special case: any enums are set with key (String)
                .plusAttributes(b -> b.name(LAUNDRY_SYMBOLS_ATTR_NAME).value(asSet("cold", "tumbleDrying")))//special case: java.util.Set of any enums is set with java.util.Set of keys (String)
                .plusAttributes(b -> b.name(MATCHING_PRODUCTS_ATTR_NAME).value(asSet(similarProductReference)))
                .plusAttributes(b -> b.name(RRP_ATTR_NAME).value(Money.builder().centAmount(300L).currencyCode("EUR")))
                .plusAttributes(b -> b.name(AVAILABLE_SINCE_ATTR_NAME).value(LocalDate.of(2015, 2, 2)))
                .build();
        final ProductDraft draft = ProductDraft.builder()
                .productType(productType.toResourceIdentifier())
                .name(LocalizedString.ofEnglish("basic shirt"))
                .slug(randomSlug())
                .masterVariant(masterVariantDraft)
                .build();

        final Product product = CommercetoolsTestUtils.getProjectApiRoot()
                .products()
                .create(draft)
                .executeBlocking()
                .getBody();

        final ProductVariant masterVariant = product.getMasterData().getStaged().getMasterVariant();
        assertThat(masterVariant.findAttribute(COLOR_ATTR_NAME).get().getValue())
                .overridingErrorMessage("on the get side, the while enum is delivered")
                .isEqualTo(AttributeLocalizedEnumValue.builder()
                        .key("green")
                        .label(LocalizedString.of(ENGLISH, "green").plus(GERMAN, "grün"))
                        .build());
        assertThat(masterVariant.findAttribute(SIZE_ATTR_NAME).get().getValue())
                .isEqualTo(AttributePlainEnumValue.builder().key("S").label("S").build());
        final AttributeLocalizedEnumValue cold = AttributeLocalizedEnumValue.builder()
                .key("cold")
                .label(LocalizedString.of(ENGLISH, "Wash at or below 30°C ").plus(GERMAN, "30°C"))
                .build();
        final AttributeLocalizedEnumValue tumbleDrying = AttributeLocalizedEnumValue.builder()
                .key("tumbleDrying")
                .label(LocalizedString.of(ENGLISH, "tumble drying").plus(GERMAN, "Trommeltrocknen"))
                .build();
        assertThat(masterVariant.findAttribute(LAUNDRY_SYMBOLS_ATTR_NAME).get().getValue())
                .isEqualTo(asList(cold, tumbleDrying));
        assertThat(masterVariant.findAttribute(MATCHING_PRODUCTS_ATTR_NAME).get().getValue())
                .isEqualTo(asList(similarProductReference));
        assertThat(masterVariant.findAttribute(RRP_ATTR_NAME).get().getValue())
                .isEqualTo(CentPrecisionMoney.builder().currencyCode("EUR").centAmount(300L).fractionDigits(2).build());
        assertThat(masterVariant.findAttribute(AVAILABLE_SINCE_ATTR_NAME).get().getValue())
                .isEqualTo(LocalDate.of(2015, 2, 2));

        return product;
    }

    public Product createBookProduct() throws Exception {
        final ProductType productType = CommercetoolsTestUtils.getProjectApiRoot()
                .productTypes()
                .get()
                .withQuery(query -> query.name().is(BOOK_PRODUCT_TYPE_NAME))
                .executeBlocking()
                .getBody()
                .head()
                .get();
        final ProductVariantDraft masterVariantDraft = ProductVariantDraft.builder()
                .plusAttributes(b -> b.name(ISBN_ATTR_NAME).value("978-3-86680-192-9"))
                .build();
        final ProductDraft draft = ProductDraft.builder()
                .productType(productType.toResourceIdentifier())
                .name(LocalizedString.ofEnglish("a book"))
                .slug(randomSlug())
                .masterVariant(masterVariantDraft)
                .build();

        final Product product = CommercetoolsTestUtils.getProjectApiRoot()
                .products()
                .create(draft)
                .executeBlocking()
                .getBody();

        final ProductVariant masterVariant = product.getMasterData().getStaged().getMasterVariant();
        assertThat(masterVariant.findAttribute(ISBN_ATTR_NAME).get().getValue()).isEqualTo("978-3-86680-192-9");
        return product;
    }

    @Test
    public void productCreationWithGetterSetter() throws Exception {
        final AttributeLocalizedEnumValue cold = AttributeLocalizedEnumValue.builder()
                .key("cold")
                .label(LocalizedString.of(ENGLISH, "Wash at or below 30°C ").plus(GERMAN, "30°C"))
                .build();
        final AttributeLocalizedEnumValue tumbleDrying = AttributeLocalizedEnumValue.builder()
                .key("tumbleDrying")
                .label(LocalizedString.of(ENGLISH, "tumble drying").plus(GERMAN, "Trommeltrocknen"))
                .build();
        final ProductReference productReference = ProductFixtures
                .referenceableProduct(CommercetoolsTestUtils.getProjectApiRoot())
                .toReference();
        final ProductType productType = fetchProductTypeByName();
        final ProductVariantDraft masterVariantDraft = ProductVariantDraft.builder()
                .plusAttributes(builder -> builder.name(COLOR_ATTR_NAME).value("green"))
                .plusAttributes(builder -> builder.name(SIZE_ATTR_NAME)
                        .value(AttributePlainEnumValue.builder().key("S").label("S").build()))
                .plusAttributes(builder -> builder.name(LAUNDRY_SYMBOLS_ATTR_NAME).value(asSet("cold", "tumbleDrying")))
                .plusAttributes(builder -> builder.name(MATCHING_PRODUCTS_ATTR_NAME).value(asSet(productReference)))
                .plusAttributes(builder -> builder.name(RRP_ATTR_NAME)
                        .value(Money.builder().centAmount(300L).currencyCode("EUR").build()))
                .plusAttributes(builder -> builder.name(AVAILABLE_SINCE_ATTR_NAME).value(LocalDate.of(2015, 2, 2)))
                .build();
        final ProductDraft draft = ProductDraft.builder()
                .productType(productType.toResourceIdentifier())
                .name(LocalizedString.ofEnglish("basic shirt"))
                .slug(randomSlug())
                .masterVariant(masterVariantDraft)
                .build();

        final Product product = CommercetoolsTestUtils.getProjectApiRoot()
                .products()
                .create(draft)
                .executeBlocking()
                .getBody();

        final ProductVariant masterVariant = product.getMasterData().getStaged().getMasterVariant();
        assertThat(masterVariant.getAttributeByName(COLOR_ATTR_NAME).asLocalizedEnum())
                .isEqualTo(AttributeLocalizedEnumValue.builder()
                        .key("green")
                        .label(LocalizedString.of(ENGLISH, "green").plus(GERMAN, "grün"))
                        .build());
        assertThat(masterVariant.getAttributeByName(SIZE_ATTR_NAME).asEnum())
                .isEqualTo(AttributePlainEnumValue.builder().key("S").label("S").build());
        assertThat(masterVariant.getAttributeByName(LAUNDRY_SYMBOLS_ATTR_NAME).asSetLocalizedEnum())
                .isEqualTo(asList(cold, tumbleDrying));
        assertThat(masterVariant.getAttributeByName(MATCHING_PRODUCTS_ATTR_NAME).asSetReference())
                .isEqualTo(singletonList(productReference));
        assertThat(masterVariant.getAttributeByName(RRP_ATTR_NAME).asMoney())
                .isEqualTo(CentPrecisionMoney.builder().centAmount(300L).currencyCode("EUR").fractionDigits(2).build());
        assertThat(masterVariant.getAttributeByName(AVAILABLE_SINCE_ATTR_NAME).asDate())
                .isEqualTo(LocalDate.of(2015, 2, 2));
    }

    @Test
    public void invalidTypeCausesException() throws Exception {
        final ProductType productType = fetchProductTypeByName();
        final ProductVariantDraft masterVariantDraft = ProductVariantDraft.builder()
                .plusAttributes(b -> b.name(COLOR_ATTR_NAME).value(1)) //1 is of illegal type and of illegal key
                .build();
        final ProductDraft draft = ProductDraft.builder()
                .productType(productType.toResourceIdentifier())
                .name(LocalizedString.ofEnglish("basic shirt"))
                .slug(randomSlug())
                .masterVariant(masterVariantDraft)
                .build();
        assertThatThrownBy(() -> CommercetoolsTestUtils.getProjectApiRoot().products().create(draft).executeBlocking())
                .isInstanceOf(ErrorResponseException.class)
                .matches(e -> ((ErrorResponseException) e).hasErrorCode(InvalidFieldError.INVALID_FIELD));
    }

    @Test
    public void readAttributeWithoutProductTypeWithName() throws Exception {
        final ProductVariant masterVariant = createProduct().getMasterData().getStaged().getMasterVariant();

        final Optional<AttributePlainEnumValue> attributeOption = masterVariant.findAttribute(SIZE_ATTR_NAME,
            AttributeAccessor::asEnum);
        assertThat(attributeOption).contains(AttributePlainEnumValue.builder().key("S").label("S").build());
    }

    @Test
    public void readAttributeWithoutProductTypeWithNamedAccess() throws Exception {
        final ProductVariant masterVariant = createProduct().getMasterData().getStaged().getMasterVariant();

        final Optional<AttributePlainEnumValue> attributeOption = masterVariant.findAttribute(SIZE_ATTR_NAME,
            AttributeAccessor::asEnum);
        assertThat(attributeOption).contains(AttributePlainEnumValue.builder().key("S").label("S").build());
    }

    @Test
    public void readAttributeGetValueAs() throws Exception {
        final ProductVariant masterVariant = createProduct().getMasterData().getStaged().getMasterVariant();

        final String attributeValue = masterVariant.findAttribute(SIZE_ATTR_NAME, AttributeAccessor::asEnum)
                .map(AttributePlainEnumValue::getLabel)
                .orElse("not found");
        assertThat(attributeValue).isEqualTo("S");
    }

    @Test
    public void readAttributeGetValueAsWithWrongType() throws Exception {
        final ProductVariant masterVariant = createProduct().getMasterData().getStaged().getMasterVariant();

        final Throwable throwable = catchThrowable(
            () -> masterVariant.findAttribute(SIZE_ATTR_NAME, AttributeAccessor::asBoolean).orElse(true));
        assertThat(throwable).isInstanceOf(JsonException.class);
    }

    @Test
    public void readAttributeWithoutProductTypeWithNamedAccessWithWrongType() throws Exception {
        final ProductVariant masterVariant = createProduct().getMasterData().getStaged().getMasterVariant();

        assertThatThrownBy(() -> masterVariant.findAttribute(SIZE_ATTR_NAME, AttributeAccessor::asBoolean))
                .isInstanceOf(JsonException.class);
    }

    @Test
    public void notPresentAttributeRead() throws Exception {
        final ProductVariant masterVariant = createProduct().getMasterData().getStaged().getMasterVariant();

        final Optional<Boolean> attributeOption = masterVariant.findAttribute("notpresent",
            AttributeAccessor::asBoolean);
        assertThat(attributeOption).isEmpty();
    }
    //
    //    @Test
    //    public void showProductAttributeTable() throws Exception {
    //        //this serves as whitelist which product attributes should be displayed
    //        //and also in this example it provides a constant order for the attributes to be displayed
    //        final List<String> attrNamesToShow = asList(COLOR_ATTR_NAME, SIZE_ATTR_NAME,
    //                MATCHING_PRODUCTS_ATTR_NAME, LAUNDRY_SYMBOLS_ATTR_NAME, RRP_ATTR_NAME, AVAILABLE_SINCE_ATTR_NAME);
    //
    //        final Product product = createProduct();
    //        final ProductProjectionQuery query = ProductProjectionQuery.ofStaged()
    //                .withPredicates(m -> m.id().is(product.getId()))
    //                .plusExpansionPaths(m -> m.masterVariant().attributes().valueSet())
    //                .plusExpansionPaths(m -> m.productType());
    //
    //        final ProductProjection productProjection = client().executeBlocking(query).head().get();
    //
    //        final ProductType productType = productProjection.getProductType().getObj();
    //        final ProductVariant masterVariant = productProjection.getMasterVariant();
    //        final List<Attribute> attributes = masterVariant.getAttributes();
    //        final MonetaryAmountFormat moneyFormat = MonetaryFormats.getAmountFormat(US);
    //
    //        final Function<Attribute, Optional<Pair<String, String>>> attributeValueExtractor = attribute -> {
    //            final Optional<String> extractedResult = AttributeExtraction.<String>of(productType, attribute)
    //                    .ifIs(AttributeAccess.ofLocalizedEnumValue(), v -> v.getLabel().find(ENGLISH).orElse(""))
    //                    .ifIs(AttributeAccess.ofEnumValue(), v -> v.getLabel())
    //                    .ifIs(AttributeAccess.ofLocalizedEnumValueSet(), v ->
    //                            v.stream()
    //                                    .map(x -> x.getLabel().get(ENGLISH))
    //                                    .filter(x -> x != null)
    //                                    .collect(joining(", ")))
    //                    .ifIs(AttributeAccess.ofProductReferenceSet(), set -> set.stream()
    //                            .map(productReference -> Optional.ofNullable(productReference.getObj())
    //                                    .map(prod -> prod.getMasterData().getStaged().getName().find(ENGLISH).orElse(""))
    //                                    .orElse(productReference.getId()))
    //                            .collect(joining(", ")))
    //                    .ifIs(AttributeAccess.ofMoney(), money -> moneyFormat.format(money))
    //                    .ifIs(AttributeAccess.ofDate(), date -> date.toString())
    //                    .findValue();
    //            final Optional<Pair<String, String>> tableRowData = extractedResult.map(value -> {
    //                final String label = productType.getAttribute(attribute.getName()).getLabel().get(ENGLISH);
    //                return ImmutablePair.of(label, value);
    //            });
    //            return tableRowData;
    //        };
    //
    //        final List<Pair<String, String>> tableData = attributes.stream()
    //
    //                .filter(a -> attrNamesToShow.contains(a.getName()))//remove attributes not in whitelist
    //                    //sort so that the order is like in attrNamesToShow
    //                .sorted(Comparator.comparingInt(a -> attrNamesToShow.indexOf(a.getName())))
    //                .map(attributeValueExtractor)
    //                .filter(x -> x.isPresent())
    //                .map(x -> x.get())
    //                .collect(toList());
    //
    //
    //        //table column length logic
    //        final List<ImmutablePair<Integer, Integer>> entryLengths = tableData.stream()
    //                .map(entry -> ImmutablePair.of(entry.getLeft().length(), entry.getRight().length())).collect(toList());
    //        final StringBuilder stringBuilder = new StringBuilder("\n");
    //        final int keyColumnWidth = entryLengths.stream().mapToInt(entry -> entry.getLeft()).max().orElse(1);
    //        final int valueColumnWidth = entryLengths.stream().mapToInt(entry -> entry.getRight()).max().orElse(1);
    //
    //        for (final Pair<String, String> entry : tableData) {
    //            stringBuilder.append(String.format("%-" + keyColumnWidth + "s", entry.getLeft()))
    //                    .append(" | ")
    //                    .append(String.format("%-" + valueColumnWidth + "s", entry.getRight()))
    //                    .append("\n")
    //                    .append(org.apache.commons.lang3.StringUtils.repeat('-', keyColumnWidth + valueColumnWidth + 3))
    //                    .append("\n");
    //        }
    //        final String table = stringBuilder.toString();
    //        final String expected = "\n" +
    //                "color                    | green                                \n" +
    //                "----------------------------------------------------------------\n" +
    //                "size                     | S                                    \n" +
    //                "----------------------------------------------------------------\n" +
    //                "matching products        | referenceable product                \n" +
    //                "----------------------------------------------------------------\n" +
    //                "washing labels           | Wash at or below 30°C , tumble drying\n" +
    //                "----------------------------------------------------------------\n" +
    //                "recommended retail price | EUR300.00                            \n" +
    //                "----------------------------------------------------------------\n" +
    //                "available since          | 2015-02-02                           \n" +
    //                "----------------------------------------------------------------\n";
    //        assertThat(table).isEqualTo(expected);
    //    }
    //

    @Test
    public void updateAttributesBooks() throws Exception {
        final Product product = createBookProduct();
        final long masterVariantId = 1;

        final Product updatedProduct = CommercetoolsTestUtils.getProjectApiRoot()
                .products()
                .update(product)
                .with(builder -> builder.plus(actionBuilder -> actionBuilder.setAttributeBuilder()
                        .variantId(masterVariantId)
                        .name(ISBN_ATTR_NAME)
                        .value("978-3-86680-192-8")))
                .executeBlocking()
                .getBody();

        final ProductVariant masterVariant = updatedProduct.getMasterData().getStaged().getMasterVariant();
        assertThat(masterVariant.findAttribute(ISBN_ATTR_NAME).get().getValue()).isEqualTo("978-3-86680-192-8");
    }

    @Test
    public void updateAttributes() throws Exception {
        final Product product = createProduct();
        final long masterVariantId = 1;
        final Product updatedProduct = CommercetoolsTestUtils.getProjectApiRoot()
                .products()
                .update(product)
                .with(update -> update
                        .plus(builder -> builder.setAttributeBuilder()
                                .variantId(masterVariantId)
                                .name(COLOR_ATTR_NAME)
                                .value("red"))
                        .plus(builder -> builder.setAttributeBuilder()
                                .variantId(masterVariantId)
                                .name(SIZE_ATTR_NAME)
                                .value("M"))
                        .plus(builder -> builder.setAttributeBuilder()
                                .variantId(masterVariantId)
                                .name(LAUNDRY_SYMBOLS_ATTR_NAME)
                                .value(asSet("cold")))
                        .plus(builder -> builder.setAttributeBuilder()
                                .variantId(masterVariantId)
                                .name(RRP_ATTR_NAME)
                                .value(Money.builder().currencyCode("EUR").centAmount(2000L))))
                .executeBlocking()
                .getBody();

        final ProductVariant masterVariant = updatedProduct.getMasterData().getStaged().getMasterVariant();
        assertThat(masterVariant.findAttribute(COLOR_ATTR_NAME, AttributeAccessor::asLocalizedEnum))
                .contains(AttributeLocalizedEnumValue.builder()
                        .key("red")
                        .label(LocalizedString.of(ENGLISH, "red").plus(GERMAN, "rot"))
                        .build());
        assertThat(masterVariant.findAttribute(SIZE_ATTR_NAME, AttributeAccessor::asEnum))
                .contains(AttributePlainEnumValue.builder().key("M").label("M").build());
        final AttributeLocalizedEnumValue cold = AttributeLocalizedEnumValue.builder()
                .key("cold")
                .label(LocalizedString.of(ENGLISH, "Wash at or below 30°C ").plus(GERMAN, "30°C"))
                .build();
        assertThat(masterVariant.findAttribute(LAUNDRY_SYMBOLS_ATTR_NAME, AttributeAccessor::asSetLocalizedEnum))
                .contains(singletonList(cold));
        assertThat(masterVariant.findAttribute(RRP_ATTR_NAME, AttributeAccessor::asMoney))
                .contains(CentPrecisionMoney.builder().centAmount(2000L).currencyCode("EUR").fractionDigits(2).build());
    }

    @Test
    public void updateWithWrongType() throws Exception {
        final Product product = createProduct();
        assertThatThrownBy(() -> CommercetoolsTestUtils.getProjectApiRoot()
                .products()
                .update(product)
                .with(update -> update.plus(builder -> builder.setAttributeBuilder()
                        .variantId(1L)
                        .name(LAUNDRY_SYMBOLS_ATTR_NAME)
                        .value("cold")))
                .executeBlocking()).isInstanceOf(ErrorResponseException.class)
                        .matches(e -> ((ErrorResponseException) e).hasErrorCode(InvalidFieldError.INVALID_FIELD));
    }

    @Test
    public void orderImportExample() throws Exception {
        final Product product = createProduct();
        //yellow is not defined in the product type, but for order imports this works to add use it on the fly
        final AttributeLocalizedEnumValue yellow = AttributeLocalizedEnumValue.builder()
                .key("yellow")
                .label(LocalizedString.of(ENGLISH, "yellow").plus(GERMAN, "gelb"))
                .build();
        final ProductVariantImportDraft productVariantImportDraft = ProductVariantImportDraft.builder()
                .id(1L)
                .plusAttributes(builder -> builder.name(COLOR_ATTR_NAME).value(yellow))
                .plusAttributes(builder -> builder.name(RRP_ATTR_NAME).value(TestUtils.EURO_30))
                .build();
        final LineItemImportDraft lineItemImportDraft = LineItemImportDraft.builder()
                .productId(product.getId())
                .variant(productVariantImportDraft)
                .quantity(1L)
                .price(p -> p.value(TestUtils.EURO_20))
                .name(LocalizedString.ofEnglish("product name"))
                .build();
        final OrderImportDraft orderImportDraft = OrderImportDraft.builder()
                .lineItems(lineItemImportDraft)
                .totalPrice(TestUtils.EURO_20)
                .orderState(OrderState.COMPLETE)
                .build();

        final Order order = CommercetoolsTestUtils.getProjectApiRoot()
                .orders()
                .importOrder()
                .post(orderImportDraft)
                .executeBlocking()
                .getBody();

        final ProductVariant productVariant = order.getLineItems().get(0).getVariant();
        final Optional<AttributeLocalizedEnumValue> colorAttribute = productVariant.findAttribute(COLOR_ATTR_NAME,
            AttributeAccessor::asLocalizedEnum);
        assertThat(colorAttribute).contains(yellow);
        final Optional<Money> rrpAttribute = productVariant.findAttribute(RRP_ATTR_NAME, AttributeAccessor::asMoney);
        assertThat(rrpAttribute).contains(TestUtils.EURO_30);
        final Set<String> presentAttributes = productVariant.getAttributes()
                .stream()
                .map(Attribute::getName)
                .collect(toSet());
        assertThat(presentAttributes).containsOnly(COLOR_ATTR_NAME, RRP_ATTR_NAME);
    }
}
