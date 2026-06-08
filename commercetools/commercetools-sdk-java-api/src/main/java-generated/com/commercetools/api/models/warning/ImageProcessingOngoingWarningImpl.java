
package com.commercetools.api.models.warning;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Contained in responses to an <span>Upload Product image</span> or an <span>Upload Product Tailoring image</span> request with response status code <code>202 Accepted</code>. Indicates that the API is still creating the remaining sizes of the uploaded image. They will be available on the Content Delivery Network (CDN) soon.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageProcessingOngoingWarningImpl implements ImageProcessingOngoingWarning, ModelBase {

    private String code;

    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImageProcessingOngoingWarningImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = IMAGE_PROCESSING_ONGOING;
    }

    /**
     * create empty instance
     */
    public ImageProcessingOngoingWarningImpl() {
        this.code = IMAGE_PROCESSING_ONGOING;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The image processing is still ongoing."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImageProcessingOngoingWarningImpl that = (ImageProcessingOngoingWarningImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(code, that.code)
                .append(message, that.message)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .build();
    }

    @Override
    public ImageProcessingOngoingWarning copyDeep() {
        return ImageProcessingOngoingWarning.deepCopy(this);
    }
}
