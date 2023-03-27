
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>For GoogleCloudFunction destinations, you need to grant permissions to the <code>extensions@commercetools-platform.iam.gserviceaccount.com</code> service account to invoke your function. If your function's version is 1st gen, grant the service account the IAM role <code>Cloud Functions Invoker</code>. For version 2nd gen, assign the IAM role <code>Cloud Run Invoker</code> using the Cloud Run console.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GoogleCloudFunctionDestinationImpl implements GoogleCloudFunctionDestination, ModelBase {

    private String type;

    private String url;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GoogleCloudFunctionDestinationImpl(@JsonProperty("url") final String url) {
        this.url = url;
        this.type = GOOGLE_CLOUD_FUNCTION;
    }

    /**
     * create empty instance
     */
    public GoogleCloudFunctionDestinationImpl() {
        this.type = GOOGLE_CLOUD_FUNCTION;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>URL to the target function.</p>
     */

    public String getUrl() {
        return this.url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GoogleCloudFunctionDestinationImpl that = (GoogleCloudFunctionDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type).append(url, that.url).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(url).toHashCode();
    }

}
