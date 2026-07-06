
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EnumAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumAttribute enumAttribute = EnumAttribute.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EnumAttributeBuilder implements Builder<EnumAttribute> {

    @Nullable
    private String name;

    private String value;

    /**
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public EnumAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The key of the enum value. Must match the key of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">AttributePlainEnumValue</a> in the Product Type.</p>
     * @param value value to be set
     * @return Builder
     */

    public EnumAttributeBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     *  <p>The key of the enum value. Must match the key of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributePlainEnumValue" rel="nofollow">AttributePlainEnumValue</a> in the Product Type.</p>
     * @return value
     */

    public String getValue() {
        return this.value;
    }

    /**
     * builds EnumAttribute with checking for non-null required values
     * @return EnumAttribute
     */
    public EnumAttribute build() {
        Objects.requireNonNull(value, EnumAttribute.class + ": value is missing");
        return new EnumAttributeImpl(name, value);
    }

    /**
     * builds EnumAttribute without checking for non-null required values
     * @return EnumAttribute
     */
    public EnumAttribute buildUnchecked() {
        return new EnumAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of EnumAttributeBuilder
     * @return builder
     */
    public static EnumAttributeBuilder of() {
        return new EnumAttributeBuilder();
    }

    /**
     * create builder for EnumAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumAttributeBuilder of(final EnumAttribute template) {
        EnumAttributeBuilder builder = new EnumAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
