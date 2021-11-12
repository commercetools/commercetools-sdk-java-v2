
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerTitleSetMessagePayloadBuilder implements Builder<CustomerTitleSetMessagePayload> {

    private String title;

    public CustomerTitleSetMessagePayloadBuilder title(final String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public CustomerTitleSetMessagePayload build() {
        Objects.requireNonNull(title, CustomerTitleSetMessagePayload.class + ": title is missing");
        return new CustomerTitleSetMessagePayloadImpl(title);
    }

    /**
     * builds CustomerTitleSetMessagePayload without checking for non null required values
     */
    public CustomerTitleSetMessagePayload buildUnchecked() {
        return new CustomerTitleSetMessagePayloadImpl(title);
    }

    public static CustomerTitleSetMessagePayloadBuilder of() {
        return new CustomerTitleSetMessagePayloadBuilder();
    }

    public static CustomerTitleSetMessagePayloadBuilder of(final CustomerTitleSetMessagePayload template) {
        CustomerTitleSetMessagePayloadBuilder builder = new CustomerTitleSetMessagePayloadBuilder();
        builder.title = template.getTitle();
        return builder;
    }

}
