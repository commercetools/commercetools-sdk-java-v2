package com.commercetools.history.models.common;


import com.commercetools.history.models.common.ImageDimensions;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageDimensionsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageDimensions imageDimensions = ImageDimensions.builder()
 *             .w(1)
 *             .h(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ImageDimensionsBuilder implements Builder<ImageDimensions> {

    
    
    private Integer w;
    
    
    
    private Integer h;

    
    /**
     * set the value to the w
     * @param w value to be set
     * @return Builder
     */
    
    public ImageDimensionsBuilder w( final Integer w) {
        this.w = w;
        return this;
    }
    
    
    
    
    /**
     * set the value to the h
     * @param h value to be set
     * @return Builder
     */
    
    public ImageDimensionsBuilder h( final Integer h) {
        this.h = h;
        return this;
    }
    
    

    /**
     * value of w}
     * @return w
     */
    
    
    public Integer getW(){
        return this.w;
    }
    
    /**
     * value of h}
     * @return h
     */
    
    
    public Integer getH(){
        return this.h;
    }

    /**
     * builds ImageDimensions with checking for non-null required values
     * @return ImageDimensions
     */
    public ImageDimensions build() {
        Objects.requireNonNull(w, ImageDimensions.class + ": w is missing");
        Objects.requireNonNull(h, ImageDimensions.class + ": h is missing");
        return new ImageDimensionsImpl(w, h);
    }
    
    /**
     * builds ImageDimensions without checking for non-null required values
     * @return ImageDimensions
     */
    public ImageDimensions buildUnchecked() {
        return new ImageDimensionsImpl(w, h);
    }

    /**
     * factory method for an instance of ImageDimensionsBuilder
     * @return builder 
     */
    public static ImageDimensionsBuilder of() {
        return new ImageDimensionsBuilder();
    }

    /**
     * create builder for ImageDimensions instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageDimensionsBuilder of(final ImageDimensions template) {
        ImageDimensionsBuilder builder = new ImageDimensionsBuilder();
        builder.w = template.getW();
        builder.h = template.getH();
        return builder;
    }

}
