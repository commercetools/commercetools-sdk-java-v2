
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeRemoveLocalizedEnumValuesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeRemoveLocalizedEnumValuesAction typeRemoveLocalizedEnumValuesAction = TypeRemoveLocalizedEnumValuesAction.builder()
 *             .fieldName("{fieldName}")
 *             .plusKeys(keysBuilder -> keysBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeRemoveLocalizedEnumValuesActionBuilder implements Builder<TypeRemoveLocalizedEnumValuesAction> {

    private String fieldName;

    private java.util.List<String> keys;

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a> to update.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public TypeRemoveLocalizedEnumValuesActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumValue" rel="nofollow">LocalizedEnumValues</a> to remove. An empty array results in no change.</p>
     * @param keys value to be set
     * @return Builder
     */

    public TypeRemoveLocalizedEnumValuesActionBuilder keys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
        return this;
    }

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumValue" rel="nofollow">LocalizedEnumValues</a> to remove. An empty array results in no change.</p>
     * @param keys value to be set
     * @return Builder
     */

    public TypeRemoveLocalizedEnumValuesActionBuilder keys(final java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }

    /**
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumValue" rel="nofollow">LocalizedEnumValues</a> to remove. An empty array results in no change.</p>
     * @param keys value to be set
     * @return Builder
     */

    public TypeRemoveLocalizedEnumValuesActionBuilder plusKeys(final String... keys) {
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
     *  <p>Keys of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumValue" rel="nofollow">LocalizedEnumValues</a> to remove. An empty array results in no change.</p>
     * @return keys
     */

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    /**
     * builds TypeRemoveLocalizedEnumValuesAction with checking for non-null required values
     * @return TypeRemoveLocalizedEnumValuesAction
     */
    public TypeRemoveLocalizedEnumValuesAction build() {
        Objects.requireNonNull(fieldName, TypeRemoveLocalizedEnumValuesAction.class + ": fieldName is missing");
        Objects.requireNonNull(keys, TypeRemoveLocalizedEnumValuesAction.class + ": keys is missing");
        return new TypeRemoveLocalizedEnumValuesActionImpl(fieldName, keys);
    }

    /**
     * builds TypeRemoveLocalizedEnumValuesAction without checking for non-null required values
     * @return TypeRemoveLocalizedEnumValuesAction
     */
    public TypeRemoveLocalizedEnumValuesAction buildUnchecked() {
        return new TypeRemoveLocalizedEnumValuesActionImpl(fieldName, keys);
    }

    /**
     * factory method for an instance of TypeRemoveLocalizedEnumValuesActionBuilder
     * @return builder
     */
    public static TypeRemoveLocalizedEnumValuesActionBuilder of() {
        return new TypeRemoveLocalizedEnumValuesActionBuilder();
    }

    /**
     * create builder for TypeRemoveLocalizedEnumValuesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeRemoveLocalizedEnumValuesActionBuilder of(final TypeRemoveLocalizedEnumValuesAction template) {
        TypeRemoveLocalizedEnumValuesActionBuilder builder = new TypeRemoveLocalizedEnumValuesActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.keys = template.getKeys();
        return builder;
    }

}
