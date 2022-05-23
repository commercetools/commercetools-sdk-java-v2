
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductImageAddedMessage productImageAddedMessage = ProductImageAddedMessage.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .sequenceNumber(0.3)
           .resource(resourceBuilder -> resourceBuilder)
           .resourceVersion(0.3)
           .variantId(0.3)
           .image(imageBuilder -> imageBuilder)
           .staged(true)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductImageAddedMessageImpl.class)
public interface ProductImageAddedMessage extends Message {

    String PRODUCT_IMAGE_ADDED = "ProductImageAdded";

    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();

    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setImage(final Image image);

    public void setStaged(final Boolean staged);

    public static ProductImageAddedMessage of() {
        return new ProductImageAddedMessageImpl();
    }

    public static ProductImageAddedMessage of(final ProductImageAddedMessage template) {
        ProductImageAddedMessageImpl instance = new ProductImageAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVariantId(template.getVariantId());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductImageAddedMessageBuilder builder() {
        return ProductImageAddedMessageBuilder.of();
    }

    public static ProductImageAddedMessageBuilder builder(final ProductImageAddedMessage template) {
        return ProductImageAddedMessageBuilder.of(template);
    }

    default <T> T withProductImageAddedMessage(Function<ProductImageAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductImageAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductImageAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductImageAddedMessage>";
            }
        };
    }
}
