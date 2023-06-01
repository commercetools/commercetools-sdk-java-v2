package com.commercetools.history.models.change_value;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change_value.AssetChangeValue;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetChangeValue assetChangeValue = AssetChangeValue.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssetChangeValueBuilder implements Builder<AssetChangeValue> {

    
    
    private String id;
    
    
    
    private com.commercetools.history.models.common.LocalizedString name;

    
    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */
    
    public AssetChangeValueBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */
    
    public AssetChangeValueBuilder name(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */
    
    public AssetChangeValueBuilder withName(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */
    
    public AssetChangeValueBuilder name( final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
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
     * builds AssetChangeValue with checking for non-null required values
     * @return AssetChangeValue
     */
    public AssetChangeValue build() {
        Objects.requireNonNull(id, AssetChangeValue.class + ": id is missing");
        Objects.requireNonNull(name, AssetChangeValue.class + ": name is missing");
        return new AssetChangeValueImpl(id, name);
    }
    
    /**
     * builds AssetChangeValue without checking for non-null required values
     * @return AssetChangeValue
     */
    public AssetChangeValue buildUnchecked() {
        return new AssetChangeValueImpl(id, name);
    }

    /**
     * factory method for an instance of AssetChangeValueBuilder
     * @return builder 
     */
    public static AssetChangeValueBuilder of() {
        return new AssetChangeValueBuilder();
    }

    /**
     * create builder for AssetChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssetChangeValueBuilder of(final AssetChangeValue template) {
        AssetChangeValueBuilder builder = new AssetChangeValueBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        return builder;
    }

}
