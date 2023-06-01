package com.commercetools.history.models.common;


import com.commercetools.history.models.common.CategoryOrderHints;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryOrderHintsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryOrderHints categoryOrderHints = CategoryOrderHints.builder()
 *             ./^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$/("{/^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$/}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategoryOrderHintsBuilder implements Builder<CategoryOrderHints> {

    
    
    private Map<String, String> values = new HashMap<>();

    /**
     * assign pattern properties to the builder
     * @param values properties to be set
     * @return Builder
     */
    
    public CategoryOrderHintsBuilder values( final Map<String, String> values){
        this.values = values;
        return this;
    }
    
    /**
     * assign a pattern property to the builder
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public CategoryOrderHintsBuilder addValue(final String key, final String value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     * values of pattern properties
     * @return pattern properties
     */
    
    
    public Map<String, String> getValues(){
        return this.values;
    }

    /**
     * builds CategoryOrderHints with checking for non-null required values
     * @return CategoryOrderHints
     */
    public CategoryOrderHints build() {
        return new CategoryOrderHintsImpl(values);
    }
    
    /**
     * builds CategoryOrderHints without checking for non-null required values
     * @return CategoryOrderHints
     */
    public CategoryOrderHints buildUnchecked() {
        return new CategoryOrderHintsImpl(values);
    }

    /**
     * factory method for an instance of CategoryOrderHintsBuilder
     * @return builder 
     */
    public static CategoryOrderHintsBuilder of() {
        return new CategoryOrderHintsBuilder();
    }

    /**
     * create builder for CategoryOrderHints instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryOrderHintsBuilder of(final CategoryOrderHints template) {
        CategoryOrderHintsBuilder builder = new CategoryOrderHintsBuilder();
        builder.values = template.values();
        return builder;
    }

}
