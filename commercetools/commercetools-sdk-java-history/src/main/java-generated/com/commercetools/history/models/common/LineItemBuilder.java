package com.commercetools.history.models.common;

import com.commercetools.history.models.common.CustomFields;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.common.Variant;
import com.commercetools.history.models.common.LineItem;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItem lineItem = LineItem.builder()
 *             .addedAt("{addedAt}")
 *             .custom(customBuilder -> customBuilder)
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productId("{productId}")
 *             .productSlug(productSlugBuilder -> productSlugBuilder)
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .quantity(1)
 *             .variant(variantBuilder -> variantBuilder)
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LineItemBuilder implements Builder<LineItem> {

    
    
    private String addedAt;
    
    
    
    private com.commercetools.history.models.common.CustomFields custom;
    
    
    
    private String id;
    
    
    
    private com.commercetools.history.models.common.LocalizedString name;
    
    
    
    private String productId;
    
    
    
    private com.commercetools.history.models.common.LocalizedString productSlug;
    
    
    
    private com.commercetools.history.models.common.Reference productType;
    
    
    
    private Integer quantity;
    
    
    
    private com.commercetools.history.models.common.Variant variant;
    
    
    
    private Integer variantId;

    
    /**
     * set the value to the addedAt
     * @param addedAt value to be set
     * @return Builder
     */
    
    public LineItemBuilder addedAt( final String addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    
    
    
    /**
     * set the value to the custom using the builder function
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public LineItemBuilder custom(Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the custom using the builder function
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public LineItemBuilder withCustom(Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the custom
     * @param custom value to be set
     * @return Builder
     */
    
    public LineItemBuilder custom( final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }
    
    
    
    
    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */
    
    public LineItemBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */
    
    public LineItemBuilder name(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */
    
    public LineItemBuilder withName(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */
    
    public LineItemBuilder name( final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     * set the value to the productId
     * @param productId value to be set
     * @return Builder
     */
    
    public LineItemBuilder productId( final String productId) {
        this.productId = productId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the productSlug using the builder function
     * @param builder function to build the productSlug value
     * @return Builder
     */
    
    public LineItemBuilder productSlug(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.productSlug = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the productSlug using the builder function
     * @param builder function to build the productSlug value
     * @return Builder
     */
    
    public LineItemBuilder withProductSlug(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.productSlug = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the productSlug
     * @param productSlug value to be set
     * @return Builder
     */
    
    public LineItemBuilder productSlug( final com.commercetools.history.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
        return this;
    }
    
    
    
    
    /**
     * set the value to the productType using the builder function
     * @param builder function to build the productType value
     * @return Builder
     */
    
    public LineItemBuilder productType(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the productType using the builder function
     * @param builder function to build the productType value
     * @return Builder
     */
    
    public LineItemBuilder withProductType(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.productType = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the productType
     * @param productType value to be set
     * @return Builder
     */
    
    public LineItemBuilder productType( final com.commercetools.history.models.common.Reference productType) {
        this.productType = productType;
        return this;
    }
    
    
    
    
    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */
    
    public LineItemBuilder quantity( final Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variant using the builder function
     * @param builder function to build the variant value
     * @return Builder
     */
    
    public LineItemBuilder variant(Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the variant using the builder function
     * @param builder function to build the variant value
     * @return Builder
     */
    
    public LineItemBuilder withVariant(Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.Variant> builder) {
        this.variant = builder.apply(com.commercetools.history.models.common.VariantBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */
    
    public LineItemBuilder variant( final com.commercetools.history.models.common.Variant variant) {
        this.variant = variant;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variantId
     * @param variantId value to be set
     * @return Builder
     */
    
    public LineItemBuilder variantId( final Integer variantId) {
        this.variantId = variantId;
        return this;
    }
    
    

    /**
     * value of addedAt}
     * @return addedAt
     */
    
    
    public String getAddedAt(){
        return this.addedAt;
    }
    
    /**
     * value of custom}
     * @return custom
     */
    
    
    public com.commercetools.history.models.common.CustomFields getCustom(){
        return this.custom;
    }
    
    /**
     * value of id}
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     * value of name}
     * @return name
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     * value of productId}
     * @return productId
     */
    
    
    public String getProductId(){
        return this.productId;
    }
    
    /**
     * value of productSlug}
     * @return productSlug
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getProductSlug(){
        return this.productSlug;
    }
    
    /**
     * value of productType}
     * @return productType
     */
    
    
    public com.commercetools.history.models.common.Reference getProductType(){
        return this.productType;
    }
    
    /**
     * value of quantity}
     * @return quantity
     */
    
    
    public Integer getQuantity(){
        return this.quantity;
    }
    
    /**
     * value of variant}
     * @return variant
     */
    
    
    public com.commercetools.history.models.common.Variant getVariant(){
        return this.variant;
    }
    
    /**
     * value of variantId}
     * @return variantId
     */
    
    
    public Integer getVariantId(){
        return this.variantId;
    }

    /**
     * builds LineItem with checking for non-null required values
     * @return LineItem
     */
    public LineItem build() {
        Objects.requireNonNull(addedAt, LineItem.class + ": addedAt is missing");
        Objects.requireNonNull(custom, LineItem.class + ": custom is missing");
        Objects.requireNonNull(id, LineItem.class + ": id is missing");
        Objects.requireNonNull(name, LineItem.class + ": name is missing");
        Objects.requireNonNull(productId, LineItem.class + ": productId is missing");
        Objects.requireNonNull(productSlug, LineItem.class + ": productSlug is missing");
        Objects.requireNonNull(productType, LineItem.class + ": productType is missing");
        Objects.requireNonNull(quantity, LineItem.class + ": quantity is missing");
        Objects.requireNonNull(variant, LineItem.class + ": variant is missing");
        Objects.requireNonNull(variantId, LineItem.class + ": variantId is missing");
        return new LineItemImpl(addedAt, custom, id, name, productId, productSlug, productType, quantity, variant, variantId);
    }
    
    /**
     * builds LineItem without checking for non-null required values
     * @return LineItem
     */
    public LineItem buildUnchecked() {
        return new LineItemImpl(addedAt, custom, id, name, productId, productSlug, productType, quantity, variant, variantId);
    }

    /**
     * factory method for an instance of LineItemBuilder
     * @return builder 
     */
    public static LineItemBuilder of() {
        return new LineItemBuilder();
    }

    /**
     * create builder for LineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemBuilder of(final LineItem template) {
        LineItemBuilder builder = new LineItemBuilder();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.productId = template.getProductId();
        builder.productSlug = template.getProductSlug();
        builder.productType = template.getProductType();
        builder.quantity = template.getQuantity();
        builder.variant = template.getVariant();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
