package com.commercetools.importapi.models.common;


import com.commercetools.importapi.models.common.AssetDimensions;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetDimensionsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetDimensions assetDimensions = AssetDimensions.builder()
 *             .w(0.3)
 *             .h(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssetDimensionsBuilder implements Builder<AssetDimensions> {

    
    
    private Integer w;
    
    
    
    private Integer h;

    
    /**
     *  <p>The width of the asset source.</p>
     * @param w value to be set
     * @return Builder
     */
    
    public AssetDimensionsBuilder w( final Integer w) {
        this.w = w;
        return this;
    }
    
    
    
    
    /**
     *  <p>The height of the asset source.</p>
     * @param h value to be set
     * @return Builder
     */
    
    public AssetDimensionsBuilder h( final Integer h) {
        this.h = h;
        return this;
    }
    
    

    /**
     *  <p>The width of the asset source.</p>
     * @return w
     */
    
    
    public Integer getW(){
        return this.w;
    }
    
    /**
     *  <p>The height of the asset source.</p>
     * @return h
     */
    
    
    public Integer getH(){
        return this.h;
    }

    /**
     * builds AssetDimensions with checking for non-null required values
     * @return AssetDimensions
     */
    public AssetDimensions build() {
        Objects.requireNonNull(w, AssetDimensions.class + ": w is missing");
        Objects.requireNonNull(h, AssetDimensions.class + ": h is missing");
        return new AssetDimensionsImpl(w, h);
    }
    
    /**
     * builds AssetDimensions without checking for non-null required values
     * @return AssetDimensions
     */
    public AssetDimensions buildUnchecked() {
        return new AssetDimensionsImpl(w, h);
    }

    /**
     * factory method for an instance of AssetDimensionsBuilder
     * @return builder 
     */
    public static AssetDimensionsBuilder of() {
        return new AssetDimensionsBuilder();
    }

    /**
     * create builder for AssetDimensions instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssetDimensionsBuilder of(final AssetDimensions template) {
        AssetDimensionsBuilder builder = new AssetDimensionsBuilder();
        builder.w = template.getW();
        builder.h = template.getH();
        return builder;
    }

}
