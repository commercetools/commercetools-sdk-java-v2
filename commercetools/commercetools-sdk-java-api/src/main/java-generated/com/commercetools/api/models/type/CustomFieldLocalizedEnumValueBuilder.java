
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomFieldLocalizedEnumValue customFieldLocalizedEnumValue = CustomFieldLocalizedEnumValue.builder()
           .key("{key}")
           .label(labelBuilder -> labelBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldLocalizedEnumValueBuilder implements Builder<CustomFieldLocalizedEnumValue> {

    private String key;

    private com.commercetools.api.models.common.LocalizedString label;

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     */

    public CustomFieldLocalizedEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Descriptive localized label of the value.</p>
     */

    public CustomFieldLocalizedEnumValueBuilder label(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Descriptive localized label of the value.</p>
     */

    public CustomFieldLocalizedEnumValueBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public CustomFieldLocalizedEnumValue build() {
        Objects.requireNonNull(key, CustomFieldLocalizedEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, CustomFieldLocalizedEnumValue.class + ": label is missing");
        return new CustomFieldLocalizedEnumValueImpl(key, label);
    }

    /**
     * builds CustomFieldLocalizedEnumValue without checking for non null required values
     */
    public CustomFieldLocalizedEnumValue buildUnchecked() {
        return new CustomFieldLocalizedEnumValueImpl(key, label);
    }

    public static CustomFieldLocalizedEnumValueBuilder of() {
        return new CustomFieldLocalizedEnumValueBuilder();
    }

    public static CustomFieldLocalizedEnumValueBuilder of(final CustomFieldLocalizedEnumValue template) {
        CustomFieldLocalizedEnumValueBuilder builder = new CustomFieldLocalizedEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
