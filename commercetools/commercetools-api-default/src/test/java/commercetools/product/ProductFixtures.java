package commercetools.product;

import com.commercetools.api.generated.models.category.Category;
import com.commercetools.api.generated.models.category.CategoryResourceIdentifierBuilder;
import com.commercetools.api.generated.models.channel.Channel;
import com.commercetools.api.generated.models.channel.ChannelResourceIdentifierBuilder;
import com.commercetools.api.generated.models.common.*;
import com.commercetools.api.generated.models.customer_group.CustomerGroup;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifierBuilder;
import com.commercetools.api.generated.models.product.*;
import com.commercetools.api.generated.models.product_discount.*;
import com.commercetools.api.generated.models.product_type.ProductType;
import com.commercetools.api.generated.models.product_type.ProductTypeDraft;
import com.commercetools.api.generated.models.product_type.ProductTypeDraftBuilder;
import com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifierBuilder;
import com.commercetools.api.generated.models.state.*;
import com.commercetools.api.generated.models.tax_category.TaxCategory;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifierBuilder;
import commercetools.category.CategoryFixtures;
import commercetools.channel.ChannelFixtures;
import commercetools.customer_group.CustomerGroupFixtures;
import commercetools.tax_category.TaxCategoryFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ProductFixtures {
    
    public static void withProduct(final Consumer<Product> consumer) {
        Product product = createProduct();
        consumer.accept(product);
        deleteProductById(product.getId(), product.getVersion());

    }
    
    public static void withUpdateableProduct(final UnaryOperator<Product> operator) {
        Product product = createProduct();
        product = operator.apply(product);
        deleteProductById(product.getId(), product.getVersion());
    }
    
    public static Product createProduct() {
        String randomKey = CommercetoolsTestUtils.randomKey();

        ProductTypeDraft productTypeDraft = ProductTypeDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .name(CommercetoolsTestUtils.randomString())
                .description(CommercetoolsTestUtils.randomString())
                .build();

        ProductType productType = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productTypes()
                .post(productTypeDraft)
                .executeBlocking().getBody();
        
        Category category = CategoryFixtures.createCategory();
        
        Map<String, String> orderHint = new HashMap<>();
        orderHint.put(category.getId(), "0.5");

        CustomerGroup customerGroup = CustomerGroupFixtures.createCustomerGroup();
        Channel channel = ChannelFixtures.createChannel();
        
        
        ProductDiscountPagedQueryResponse existing = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productDiscounts()
                .get()
                .withWhere(Arrays.asList("sortOrder=\"0.3\""))
                .executeBlocking()
                .getBody();
        
        if(existing.getCount() != 0) {
            String productDiscountId = existing.getResults().get(0).getId();
            Long productDiscountVersion = existing.getResults().get(0).getVersion();
            CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .productDiscounts()
                    .withId(productDiscountId)
                    .delete()
                    .addVersion(productDiscountVersion)
                    .executeBlocking();
        }
                
        ProductDiscountDraft productDiscountDraft =  ProductDiscountDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .key(CommercetoolsTestUtils.randomKey())
                .sortOrder("0.3")
                .predicate("product.key=\"" + randomKey + "\"")
                .value(ProductDiscountValueExternalDraftBuilder.of().build())
                .isActive(true)
                .build();

        ProductDiscount productDiscount = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .productDiscounts()
                .post(productDiscountDraft)
                .executeBlocking().getBody();

        PriceDraft priceDraft = PriceDraftBuilder.of()
                .value(CentPrecisionMoneyDraftBuilder.of().centAmount(100L).currencyCode("EUR").build())
                .country("DE")
                .customerGroup(CustomerGroupResourceIdentifierBuilder.of()
                        .id(customerGroup.getId())
                        .build())
                .channel(ChannelResourceIdentifierBuilder.of().id(channel.getId()).build())
                .discounted(DiscountedPriceBuilder.of()
                        .value(CentPrecisionMoneyDraftBuilder.of()
                                .centAmount(200L)
                                .currencyCode("EUR")
                                .build())
                        .discount(ProductDiscountReferenceBuilder.of()
                                .id(productDiscount.getId())
                                .build())
                        .build())
                .validFrom(ZonedDateTime.now())
                .validUntil(ZonedDateTime.now().plus(1, ChronoUnit.HOURS))
                .tiers(Arrays.asList(PriceTierDraftBuilder.of()
                        .minimumQuantity(10L)
                        .value(CentPrecisionMoneyDraftBuilder.of()
                                .centAmount(100L)
                                .currencyCode("EUR")
                                .build())
                        .build()))
                .build();
        
        ProductVariantDraft productVariantDraft = ProductVariantDraftBuilder.of()
                .sku(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .prices(Arrays.asList(priceDraft))
                .images(Arrays.asList(ImageBuilder.of()
                        .url("http://www.google.com")
                        .dimensions(ImageDimensionsBuilder.of()
                                .w(100)
                                .h(100)
                                .build())
                        .label(CommercetoolsTestUtils.randomString()).build()))
                .assets(Arrays.asList(AssetDraftBuilder.of()
                        .key(CommercetoolsTestUtils.randomKey())
                        .sources(Arrays.asList(AssetSourceBuilder.of()
                                .uri("http://www.google.com")
                                .key(CommercetoolsTestUtils.randomKey())
                                .dimensions(AssetDimensionsBuilder.of()
                                        .h(10)
                                        .w(10)
                                        .build())
                                .contentType("application/json")
                                .build()))
                        .name(CommercetoolsTestUtils.randomLocalizedString())
                        .build()))
                .build();

        TaxCategory taxCategory = TaxCategoryFixtures.createTaxCategory();
        Map<String, List<SearchKeyword>> searchKeywords = new HashMap<>();
        searchKeywords.put("asdf", Arrays.asList(SearchKeywordBuilder.of()
                .text("asdf")
                .suggestTokenizer(WhitespaceTokenizerBuilder.of()
                        .build())
                .build()));

        StateDraft stateDraft = StateDraftBuilder.of()
                .type(StateTypeEnum.PRODUCT_STATE)
                .key(CommercetoolsTestUtils.randomKey())
                .build();

        State state = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .states()
                .post(stateDraft)
                .executeBlocking().getBody();
        
        ProductDraft productDraft = ProductDraftBuilder.of()
                .key(randomKey)
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .productType(ProductTypeResourceIdentifierBuilder.of()
                        .id(productType.getId())
                        .build())
                .slug(CommercetoolsTestUtils.randomLocalizedString())
                .description(CommercetoolsTestUtils.randomLocalizedString())
                .categories(Arrays.asList(CategoryResourceIdentifierBuilder.of()
                        .id(category.getId())
                        .build()))
                .categoryOrderHints(CategoryOrderHintsBuilder.of()
                    .values(orderHint)
                    .build())
                .metaTitle(CommercetoolsTestUtils.randomLocalizedString())
                .metaDescription(CommercetoolsTestUtils.randomLocalizedString())
                .metaKeywords(CommercetoolsTestUtils.randomLocalizedString())
                .variants(Arrays.asList(productVariantDraft))
                .taxCategory(TaxCategoryResourceIdentifierBuilder.of().id(taxCategory.getId()).build())
                .searchKeywords(SearchKeywordsBuilder.of()
                        .values(searchKeywords)
                        .build())
                .state(StateResourceIdentifierBuilder.of()
                        .id(state.getId())
                        .build())
                .publish(false)
                .build();
        
        Product product = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .products()
                .post(productDraft)
                .executeBlocking().getBody();
        Assert.assertNotNull(product);
        Assert.assertEquals(product.getKey(), productDraft.getKey());
        
        return product;
    }
    
    public static Product deleteProductById(final String id, final Long version) {
        Product product = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .products()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();
        Assert.assertNotNull(product);
        Assert.assertEquals(product.getId(), id);
        return product;
    }
    
    public static Product deleteProductByKey(final String key, final Long version) {
        Product product = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .products()
                .withKey(key)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();
        Assert.assertNotNull(product);
        Assert.assertEquals(product.getKey(), key);
        return product;
    }
    
}
