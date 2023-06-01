package com.commercetools.api.models.type;

import java.lang.Object;
import com.commercetools.api.models.type.FieldContainer;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldContainerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldContainer fieldContainer = FieldContainer.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class FieldContainerBuilder implements Builder<FieldContainer> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the FieldDefinitions) and values given by CustomFieldValue.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public FieldContainerBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the FieldDefinitions) and values given by CustomFieldValue.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public FieldContainerBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p>JSON object with keys matching the names of Custom Fields (that is, <code>name</code>s in the FieldDefinitions) and values given by CustomFieldValue.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }

    /**
     * builds FieldContainer with checking for non-null required values
     * @return FieldContainer
     */
    public FieldContainer build() {
        return new FieldContainerImpl(values);
    }
    
    /**
     * builds FieldContainer without checking for non-null required values
     * @return FieldContainer
     */
    public FieldContainer buildUnchecked() {
        return new FieldContainerImpl(values);
    }

    /**
     * factory method for an instance of FieldContainerBuilder
     * @return builder 
     */
    public static FieldContainerBuilder of() {
        return new FieldContainerBuilder();
    }

    /**
     * create builder for FieldContainer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldContainerBuilder of(final FieldContainer template) {
        FieldContainerBuilder builder = new FieldContainerBuilder();
        builder.values = template.values();
        return builder;
    }

}
