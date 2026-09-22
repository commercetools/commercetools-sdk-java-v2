
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeRemoveEnumValuesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeRemoveEnumValuesAction typeRemoveEnumValuesAction = TypeRemoveEnumValuesAction.builder()
 *             .fieldName("{fieldName}")
 *             .plusKeys(keysBuilder -> keysBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeRemoveEnumValuesActionBuilder implements Builder<TypeRemoveEnumValuesAction> {

    private String fieldName;

    private java.util.List<String> keys;

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public TypeRemoveEnumValuesActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumValue" rel="nofollow">EnumValues</a> to remove. An empty array results in no change.</p>
     * @param keys value to be set
     * @return Builder
     */

    public TypeRemoveEnumValuesActionBuilder keys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
        return this;
    }

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumValue" rel="nofollow">EnumValues</a> to remove. An empty array results in no change.</p>
     * @param keys value to be set
     * @return Builder
     */

    public TypeRemoveEnumValuesActionBuilder keys(final java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumValue" rel="nofollow">EnumValues</a> to remove. An empty array results in no change.</p>
     * @param keys value to be set
     * @return Builder
     */

    public TypeRemoveEnumValuesActionBuilder plusKeys(final String... keys) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.addAll(Arrays.asList(keys));
        return this;
    }

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumValue" rel="nofollow">EnumValues</a> to remove. An empty array results in no change.</p>
     * @return keys
     */

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    /**
     * builds TypeRemoveEnumValuesAction with checking for non-null required values
     * @return TypeRemoveEnumValuesAction
     */
    public TypeRemoveEnumValuesAction build() {
        Objects.requireNonNull(fieldName, TypeRemoveEnumValuesAction.class + ": fieldName is missing");
        Objects.requireNonNull(keys, TypeRemoveEnumValuesAction.class + ": keys is missing");
        return new TypeRemoveEnumValuesActionImpl(fieldName, keys);
    }

    /**
     * builds TypeRemoveEnumValuesAction without checking for non-null required values
     * @return TypeRemoveEnumValuesAction
     */
    public TypeRemoveEnumValuesAction buildUnchecked() {
        return new TypeRemoveEnumValuesActionImpl(fieldName, keys);
    }

    /**
     * factory method for an instance of TypeRemoveEnumValuesActionBuilder
     * @return builder
     */
    public static TypeRemoveEnumValuesActionBuilder of() {
        return new TypeRemoveEnumValuesActionBuilder();
    }

    /**
     * create builder for TypeRemoveEnumValuesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeRemoveEnumValuesActionBuilder of(final TypeRemoveEnumValuesAction template) {
        TypeRemoveEnumValuesActionBuilder builder = new TypeRemoveEnumValuesActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.keys = template.getKeys();
        return builder;
    }

}
