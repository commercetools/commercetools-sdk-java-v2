package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
import com.commercetools.api.models.zone.ZoneChangeNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneChangeNameAction zoneChangeNameAction = ZoneChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ZoneChangeNameActionBuilder implements Builder<ZoneChangeNameAction> {

    
    
    private String name;

    
    /**
     *  <p>New name of the Zone.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ZoneChangeNameActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    

    /**
     *  <p>New name of the Zone.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }

    /**
     * builds ZoneChangeNameAction with checking for non-null required values
     * @return ZoneChangeNameAction
     */
    public ZoneChangeNameAction build() {
        Objects.requireNonNull(name, ZoneChangeNameAction.class + ": name is missing");
        return new ZoneChangeNameActionImpl(name);
    }
    
    /**
     * builds ZoneChangeNameAction without checking for non-null required values
     * @return ZoneChangeNameAction
     */
    public ZoneChangeNameAction buildUnchecked() {
        return new ZoneChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of ZoneChangeNameActionBuilder
     * @return builder 
     */
    public static ZoneChangeNameActionBuilder of() {
        return new ZoneChangeNameActionBuilder();
    }

    /**
     * create builder for ZoneChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneChangeNameActionBuilder of(final ZoneChangeNameAction template) {
        ZoneChangeNameActionBuilder builder = new ZoneChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
