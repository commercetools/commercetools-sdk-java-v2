
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface OrderMessage extends Message {

    default <T> T withOrderMessage(Function<OrderMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderMessage>";
            }
        };
    }
}
