package com.commercetools.api.models.channel;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelResourceIdentifier channelResourceIdentifier = ChannelResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChannelResourceIdentifierBuilder implements Builder<ChannelResourceIdentifier> {

    
    @Nullable
    private String id;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Unique identifier of the referenced Channel. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ChannelResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the referenced Channel. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ChannelResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced Channel. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced Channel. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds ChannelResourceIdentifier with checking for non-null required values
     * @return ChannelResourceIdentifier
     */
    public ChannelResourceIdentifier build() {
        return new ChannelResourceIdentifierImpl(id, key);
    }
    
    /**
     * builds ChannelResourceIdentifier without checking for non-null required values
     * @return ChannelResourceIdentifier
     */
    public ChannelResourceIdentifier buildUnchecked() {
        return new ChannelResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ChannelResourceIdentifierBuilder
     * @return builder 
     */
    public static ChannelResourceIdentifierBuilder of() {
        return new ChannelResourceIdentifierBuilder();
    }

    /**
     * create builder for ChannelResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelResourceIdentifierBuilder of(final ChannelResourceIdentifier template) {
        ChannelResourceIdentifierBuilder builder = new ChannelResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
