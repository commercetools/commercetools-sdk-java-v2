
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeLocalizedEnumValueOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeLocalizedEnumValueOrderAction typeChangeLocalizedEnumValueOrderAction = TypeChangeLocalizedEnumValueOrderAction.builder()
 *             .fieldName("{fieldName}")
 *             .plusKeys(keysBuilder -> keysBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeLocalizedEnumValueOrderActionBuilder
        implements Builder<TypeChangeLocalizedEnumValueOrderAction> {

    private String fieldName;

    private java.util.List<String> keys;

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">Field Definition</a> to update.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public TypeChangeLocalizedEnumValueOrderActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Must match the set of <code>key</code>s of the LocalizedEnumValues in the FieldDefinition (up to order).</p>
     * @param keys value to be set
     * @return Builder
     */

    public TypeChangeLocalizedEnumValueOrderActionBuilder keys(final String... keys) {
        this.keys = new ArrayList<>(Arrays.asList(keys));
        return this;
    }

    /**
     *  <p>Must match the set of <code>key</code>s of the LocalizedEnumValues in the FieldDefinition (up to order).</p>
     * @param keys value to be set
     * @return Builder
     */

    public TypeChangeLocalizedEnumValueOrderActionBuilder keys(final java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }

    /**
     *  <p>Must match the set of <code>key</code>s of the LocalizedEnumValues in the FieldDefinition (up to order).</p>
     * @param keys value to be set
     * @return Builder
     */

    public TypeChangeLocalizedEnumValueOrderActionBuilder plusKeys(final String... keys) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.addAll(Arrays.asList(keys));
        return this;
    }

    /**
     *  <p><code>name</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">Field Definition</a> to update.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Must match the set of <code>key</code>s of the LocalizedEnumValues in the FieldDefinition (up to order).</p>
     * @return keys
     */

    public java.util.List<String> getKeys() {
        return this.keys;
    }

    /**
     * builds TypeChangeLocalizedEnumValueOrderAction with checking for non-null required values
     * @return TypeChangeLocalizedEnumValueOrderAction
     */
    public TypeChangeLocalizedEnumValueOrderAction build() {
        Objects.requireNonNull(fieldName, TypeChangeLocalizedEnumValueOrderAction.class + ": fieldName is missing");
        Objects.requireNonNull(keys, TypeChangeLocalizedEnumValueOrderAction.class + ": keys is missing");
        return new TypeChangeLocalizedEnumValueOrderActionImpl(fieldName, keys);
    }

    /**
     * builds TypeChangeLocalizedEnumValueOrderAction without checking for non-null required values
     * @return TypeChangeLocalizedEnumValueOrderAction
     */
    public TypeChangeLocalizedEnumValueOrderAction buildUnchecked() {
        return new TypeChangeLocalizedEnumValueOrderActionImpl(fieldName, keys);
    }

    /**
     * factory method for an instance of TypeChangeLocalizedEnumValueOrderActionBuilder
     * @return builder
     */
    public static TypeChangeLocalizedEnumValueOrderActionBuilder of() {
        return new TypeChangeLocalizedEnumValueOrderActionBuilder();
    }

    /**
     * create builder for TypeChangeLocalizedEnumValueOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeLocalizedEnumValueOrderActionBuilder of(
            final TypeChangeLocalizedEnumValueOrderAction template) {
        TypeChangeLocalizedEnumValueOrderActionBuilder builder = new TypeChangeLocalizedEnumValueOrderActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.keys = template.getKeys();
        return builder;
    }

}
