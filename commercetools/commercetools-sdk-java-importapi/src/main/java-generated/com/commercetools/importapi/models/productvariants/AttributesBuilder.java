package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.Attributes;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributesBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Attributes attributes = Attributes.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributesBuilder implements Builder<Attributes> {

    
    
    private Map<String, com.commercetools.importapi.models.productvariants.Attribute> values = new HashMap<>();

    /**
     *  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself. And since this property will be represented as a map, we can set individual attributes to null to delete them (which follows JSON Merge Patch semantics).</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public AttributesBuilder values( final Map<String, com.commercetools.importapi.models.productvariants.Attribute> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself. And since this property will be represented as a map, we can set individual attributes to null to delete them (which follows JSON Merge Patch semantics).</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public AttributesBuilder addValue(final String key, final com.commercetools.importapi.models.productvariants.Attribute value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p>The name of the attribute is given by the key and shouldn't be set on the attribute itself. And since this property will be represented as a map, we can set individual attributes to null to delete them (which follows JSON Merge Patch semantics).</p>
     * @return pattern properties
     */
    
    
    public Map<String, com.commercetools.importapi.models.productvariants.Attribute> getValues(){
        return this.values;
    }

    /**
     * builds Attributes with checking for non-null required values
     * @return Attributes
     */
    public Attributes build() {
        return new AttributesImpl(values);
    }
    
    /**
     * builds Attributes without checking for non-null required values
     * @return Attributes
     */
    public Attributes buildUnchecked() {
        return new AttributesImpl(values);
    }

    /**
     * factory method for an instance of AttributesBuilder
     * @return builder 
     */
    public static AttributesBuilder of() {
        return new AttributesBuilder();
    }

    /**
     * create builder for Attributes instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributesBuilder of(final Attributes template) {
        AttributesBuilder builder = new AttributesBuilder();
        builder.values = template.values();
        return builder;
    }

}
