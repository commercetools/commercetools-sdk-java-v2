
package com.commercetools.importapi.models.productvariants;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   TimeAttribute timeAttribute = TimeAttribute.builder()
           .value(LocalTime.parse("12:00:00.301"))
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeAttributeBuilder implements Builder<TimeAttribute> {

    @Nullable
    private String name;

    private java.time.LocalTime value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public TimeAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public TimeAttributeBuilder value(final java.time.LocalTime value) {
        this.value = value;
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.time.LocalTime getValue() {
        return this.value;
    }

    public TimeAttribute build() {
        Objects.requireNonNull(value, TimeAttribute.class + ": value is missing");
        return new TimeAttributeImpl(name, value);
    }

    /**
     * builds TimeAttribute without checking for non null required values
     */
    public TimeAttribute buildUnchecked() {
        return new TimeAttributeImpl(name, value);
    }

    public static TimeAttributeBuilder of() {
        return new TimeAttributeBuilder();
    }

    public static TimeAttributeBuilder of(final TimeAttribute template) {
        TimeAttributeBuilder builder = new TimeAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
