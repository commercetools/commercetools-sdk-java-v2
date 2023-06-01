package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.AssetDimensions;
import com.commercetools.importapi.models.common.ImageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>An Image uploaded to commercetools Composable Commerce is stored in a Content Delivery Network and it's available in several pre-defined sizes. If you already have an image stored on an external service, you can save the URL when creating a new product or adding a variant, or you can add it later.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Image image = Image.builder()
 *             .url("{url}")
 *             .dimensions(dimensionsBuilder -> dimensionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ImageImpl.class)
public interface Image  {


    /**
     *  <p>URL of the image in its original size. The URL must be unique within a single variant. It can be used to obtain the image in different sizes.</p>
     * @return url
     */
    @NotNull
    @JsonProperty("url")
    public String getUrl();
    /**
     *  <p>Dimensions of the original image. This can be used by your application, for example, to determine whether the image is large enough to display a zoom view.</p>
     * @return dimensions
     */
    @NotNull
    @Valid
    @JsonProperty("dimensions")
    public AssetDimensions getDimensions();
    /**
     *  <p>Custom label that can be used, for example, as an image description.</p>
     * @return label
     */
    
    @JsonProperty("label")
    public String getLabel();

    /**
     *  <p>URL of the image in its original size. The URL must be unique within a single variant. It can be used to obtain the image in different sizes.</p>
     * @param url value to be set
     */
    
    public void setUrl(final String url);
    
    
    /**
     *  <p>Dimensions of the original image. This can be used by your application, for example, to determine whether the image is large enough to display a zoom view.</p>
     * @param dimensions value to be set
     */
    
    public void setDimensions(final AssetDimensions dimensions);
    
    
    /**
     *  <p>Custom label that can be used, for example, as an image description.</p>
     * @param label value to be set
     */
    
    public void setLabel(final String label);
    

    /**
     * factory method
     * @return instance of Image
     */
    public static Image of(){
        return new ImageImpl();
    }
    

    /**
     * factory method to create a shallow copy Image
     * @param template instance to be copied
     * @return copy instance
     */
    public static Image of(final Image template) {
        ImageImpl instance = new ImageImpl();
        instance.setUrl(template.getUrl());
        instance.setDimensions(template.getDimensions());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * factory method to create a deep copy of Image
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Image deepCopy(@Nullable final Image template) {
        if (template == null) {
            return null;
        }
        ImageImpl instance = new ImageImpl();
        instance.setUrl(template.getUrl());
        instance.setDimensions(com.commercetools.importapi.models.common.AssetDimensions.deepCopy(template.getDimensions()));
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * builder factory method for Image
     * @return builder
     */
    public static ImageBuilder builder() {
        return ImageBuilder.of();
    }
    
    /**
     * create builder for Image instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageBuilder builder(final Image template) {
        return ImageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImage(Function<Image, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Image> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Image>() {
            @Override
            public String toString() {
                return "TypeReference<Image>";
            }
        };
    }
}
