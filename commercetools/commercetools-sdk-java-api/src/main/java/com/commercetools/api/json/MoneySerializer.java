
package com.commercetools.api.json;

import java.io.IOException;

import javax.money.MonetaryAmount;

import com.commercetools.api.models.common.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

final class MoneySerializer extends JsonSerializer<MonetaryAmount> {
    static final long serialVersionUID = 0L;

    @Override
    public void serializeWithType(MonetaryAmount monetaryAmount, JsonGenerator gen, SerializerProvider serializers,
            TypeSerializer typeSer) throws IOException {
        serialize(monetaryAmount, gen, serializers);
    }

    @Override
    public void serialize(final MonetaryAmount monetaryAmount, final JsonGenerator gen,
            final SerializerProvider serializerProvider) throws IOException {
        final MoneyRepresentation moneyRepresentation;

        if (monetaryAmount instanceof HighPrecisionMoney) {
            moneyRepresentation = new HighPrecisionMoneyRepresentation((HighPrecisionMoney) monetaryAmount);
        }
        else if (monetaryAmount instanceof HighPrecisionMoneyDraft) {
            moneyRepresentation = new HighPrecisionMoneyRepresentation((HighPrecisionMoneyDraft) monetaryAmount);
        }
        else if (monetaryAmount instanceof CentPrecisionMoney) {
            moneyRepresentation = new CentPrecisionMoneyRepresentation((CentPrecisionMoney) monetaryAmount);
        }
        else if (monetaryAmount instanceof CentPrecisionMoneyDraft) {
            moneyRepresentation = new CentPrecisionMoneyRepresentation((CentPrecisionMoneyDraft) monetaryAmount);
        }
        else {
            moneyRepresentation = new CentPrecisionMoneyRepresentation(monetaryAmount);
        }

        gen.writeObject(moneyRepresentation);
    }
}
