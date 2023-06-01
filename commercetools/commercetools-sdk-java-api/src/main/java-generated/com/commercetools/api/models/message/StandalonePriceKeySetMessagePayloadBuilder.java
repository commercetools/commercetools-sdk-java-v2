package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.StandalonePriceKeySetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceKeySetMessagePayload standalonePriceKeySetMessagePayload = StandalonePriceKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceKeySetMessagePayloadBuilder implements Builder<StandalonePriceKeySetMessagePayload> {

    
    @Nullable
    private String key;
    
    
    @Nullable
    private String oldKey;

    
    /**
     *  <p><code>key</code> value of the StandalonePrice after the Set Key update action.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public StandalonePriceKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>key</code> value of the StandalonePrice before the Set Key update action.</p>
     * @param oldKey value to be set
     * @return Builder
     */
    
    public StandalonePriceKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
        return this;
    }
    
    

    /**
     *  <p><code>key</code> value of the StandalonePrice after the Set Key update action.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p><code>key</code> value of the StandalonePrice before the Set Key update action.</p>
     * @return oldKey
     */
    
    @Nullable
    public String getOldKey(){
        return this.oldKey;
    }

    /**
     * builds StandalonePriceKeySetMessagePayload with checking for non-null required values
     * @return StandalonePriceKeySetMessagePayload
     */
    public StandalonePriceKeySetMessagePayload build() {
        return new StandalonePriceKeySetMessagePayloadImpl(key, oldKey);
    }
    
    /**
     * builds StandalonePriceKeySetMessagePayload without checking for non-null required values
     * @return StandalonePriceKeySetMessagePayload
     */
    public StandalonePriceKeySetMessagePayload buildUnchecked() {
        return new StandalonePriceKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * factory method for an instance of StandalonePriceKeySetMessagePayloadBuilder
     * @return builder 
     */
    public static StandalonePriceKeySetMessagePayloadBuilder of() {
        return new StandalonePriceKeySetMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceKeySetMessagePayloadBuilder of(final StandalonePriceKeySetMessagePayload template) {
        StandalonePriceKeySetMessagePayloadBuilder builder = new StandalonePriceKeySetMessagePayloadBuilder();
        builder.key = template.getKey();
        builder.oldKey = template.getOldKey();
        return builder;
    }

}
