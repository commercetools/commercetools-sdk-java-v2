
package commercetools.payment;

import static commercetools.payment.PaymentFixtures.*;
import static commercetools.type.TypeFixtures.withType;

import java.util.Collections;

import com.commercetools.api.models.common.MoneyBuilder;
import com.commercetools.api.models.payment.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentIntegrationTests {

    @Test
    public void createAndDelete() {
        final Payment payment = createPayment();
        Assertions.assertThat(payment).isNotNull();
        final Payment deletedPayment = deletePayment(payment.getId(), payment.getVersion());
        Assertions.assertThat(payment.getId()).isEqualTo(deletedPayment.getId());
    }

    @Test
    public void addTransaction() {
        withUpdateablePayment(payment -> {
            final PaymentAddTransactionAction addTransactionAction = PaymentAddTransactionActionBuilder.of()
                    .transaction(transactionDraftBuilder -> transactionDraftBuilder.type(TransactionType.CHARGE)
                            .amount(MoneyBuilder.of().centAmount(1000L).currencyCode("EUR").build()))
                    .build();

            final Payment updatedPayment = CommercetoolsTestUtils.getProjectApiRoot()
                    .payments()
                    .update(payment)
                    .with(builder -> builder.plus(addTransactionAction))
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(updatedPayment.getTransactions()).hasSize(payment.getTransactions().size() + 1);

            return updatedPayment;
        });
    }

    @Test
    public void addInterfaceInteraction() {
        withType(type -> {
            withUpdateablePayment(payment -> {
                final PaymentAddInterfaceInteractionAction addInterfaceInteractionAction = PaymentAddInterfaceInteractionActionBuilder
                        .of()
                        .type(typeResourceIdentifierBuilder -> typeResourceIdentifierBuilder.id(type.getId()))
                        .fields(fieldContainerBuilder -> fieldContainerBuilder.addValue("string-field", "test"))
                        .build();

                final Payment updatedPayment = CommercetoolsTestUtils.getProjectApiRoot()
                        .payments()
                        .update(payment)
                        .with(builder -> builder.plus(addInterfaceInteractionAction))
                        .executeBlocking()
                        .getBody();

                Assertions.assertThat(updatedPayment.getInterfaceInteractions())
                        .hasSize(payment.getInterfaceInteractions().size() + 1);

                return updatedPayment;
            });
        });
    }

    @Test
    public void setCustomField() {
        withType(type -> {
            withUpdateablePayment(payment -> {
                final PaymentSetCustomTypeAction setCustomTypeAction = PaymentSetCustomTypeActionBuilder.of()
                        .type(typeResourceIdentifierBuilder -> typeResourceIdentifierBuilder.id(type.getId()))
                        .build();

                final Payment paymentWithType = CommercetoolsTestUtils.getProjectApiRoot()
                        .payments()
                        .update(payment)
                        .with(builder -> builder.plus(setCustomTypeAction))
                        .executeBlocking()
                        .getBody();

                final PaymentSetCustomFieldAction setCustomFieldAction = PaymentSetCustomFieldActionBuilder.of()
                        .name("string-field")
                        .value("test")
                        .build();

                final Payment paymentWithCustomField = CommercetoolsTestUtils.getProjectApiRoot()
                        .payments()
                        .update(paymentWithType)
                        .with(builder -> builder.plus(setCustomFieldAction))
                        .executeBlocking()
                        .getBody();

                Assertions.assertThat(paymentWithCustomField.getCustom().getFields().values())
                        .isEqualTo(Collections.singletonMap("string-field", "test"));

                return paymentWithCustomField;
            });
        });
    }
}
