package com.example.android.securityquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.securityquizapp.R.string.test_result_score;

public class MainActivity extends AppCompatActivity {

    /**
     * The number of correct answers
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the end test button is clicked.
     */
    public void endTest(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //Called question checking methods
        onCheckedQuestion1();
        onCheckedQuestion2();
        onCheckedQuestion3();
        onCheckedQuestion4();
        onCheckedQuestion5();
        onCheckedQuestion6();
        onCheckedQuestion7();
        onCheckedQuestion8();
        onCheckedQuestion9();
        onCheckedQuestion10();

        // Display the test result on the screen
        String test_result = createTestResult(name, score);
        displayResult(test_result);
        Toast.makeText(getApplicationContext(), test_result, Toast.LENGTH_LONG).show();

        // Disabled "End Test" button after clicking on it.
        Button endTestButton = (Button) findViewById(R.id.end_test_button);
        endTestButton.setEnabled(false);
    }

    /**
     * Create summary of the test result.
     *
     * @param name of the passing the test
     * @param score of the counting of right answers
     * @return text of the test result
     */
    private String createTestResult(String name, int score) {
        String test_result = getString(R.string.test_result_name) + name;
        test_result += "\n" + getString(test_result_score) + score;
        return test_result;
    }

    /**
     * This method counter correct answers in question 1
     * Which of the following are the primary goals of network security? (Choose 3 best answers)
     * "Which of the following are the primary goals of network security? (Choose 3 best answers)"
     */
    public void onCheckedQuestion1() {
        // Figure out if the user chose "Redundancy" answer
        CheckBox RedundancyCheckBox = (CheckBox) findViewById(R.id.redundancy_checkbox);
        boolean hasRedundancy = RedundancyCheckBox.isChecked();

        if (hasRedundancy) {
            increment_score();
        }

        // Figure out if the user chose "Availability" answer
        CheckBox AvailabilityCheckBox = (CheckBox) findViewById(R.id.availability_checkbox);
        boolean hasAvailability = AvailabilityCheckBox.isChecked();

        if (hasAvailability) {
            increment_score();
        }

        // Figure out if the user chose "Integrity" answer
        CheckBox IntegrityCheckBox = (CheckBox) findViewById(R.id.integrity_checkbox);
        boolean hasIntegrity = IntegrityCheckBox.isChecked();

        if (hasIntegrity) {
            increment_score();
        }

        // Figure out if the user chose "Confidentiality" answer
        CheckBox ConfidentialityCheckBox = (CheckBox) findViewById(R.id.confidentiality_checkbox);
        boolean hasConfidentiality = ConfidentialityCheckBox.isChecked();

        if (hasConfidentiality) {
            increment_score();
        }

        // Figure out if the user chose "RemoteAccess" answer
        CheckBox RemoteAccessCheckBox = (CheckBox) findViewById(R.id.remote_access_checkbox);
        boolean hasRemoteAccess = RemoteAccessCheckBox.isChecked();

        if (hasRemoteAccess) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 2
     * Which of the following statements best describes confidentiality of information?
     * "Which of the following statements best describes confidentiality of information?"
     */
    public void onCheckedQuestion2() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_2);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_2_1_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_1_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_4_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 3
     * According to Cisco, organizational data is classified into four categories. Which of the following is NOT classification category?
     * "According to Cisco, organizational data is classified into four categories. Which of the following is NOT classification category?"
     */
    public void onCheckedQuestion3() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_3);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.trusty_worthy_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.trusty_worthy_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.publ_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.sensitive_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.confidential_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.private_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 4
     * What are the THREE security solution that Cisco recommends for comprehensive security?
     * "What are the THREE security solution that Cisco recommends for comprehensive security?"
     */
    public void onCheckedQuestion4() {
        // Figure out if the user chose "Managerial" answer
        CheckBox ManagerialCheckBox = (CheckBox) findViewById(R.id.managerial_checkbox);
        boolean hasManagerial = ManagerialCheckBox.isChecked();

        if (hasManagerial) {
            increment_score();
        }

        // Figure out if the user chose "Physical" answer
        CheckBox PhysicalCheckBox = (CheckBox) findViewById(R.id.physical_checkbox);
        boolean hasPhysical = PhysicalCheckBox.isChecked();

        if (hasPhysical) {
            increment_score();
        }

        // Figure out if the user chose "Logical" answer
        CheckBox LogicalCheckBox = (CheckBox) findViewById(R.id.logical_checkbox);
        boolean hasLogical = LogicalCheckBox.isChecked();

        if (hasLogical) {
            increment_score();
        }

        // Figure out if the user chose "Administrative" answer
        CheckBox AdministrativeCheckBox = (CheckBox) findViewById(R.id.administrative_checkbox);
        boolean hasAdministrative = AdministrativeCheckBox.isChecked();

        if (hasAdministrative) {
            increment_score();
        }

        // Figure out if the user chose "Geographical" answer
        CheckBox GeographicalCheckBox = (CheckBox) findViewById(R.id.geographical_checkbox);
        boolean hasGeographical = GeographicalCheckBox.isChecked();

        if (hasGeographical) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 5
     * Which of the following is true about Dynamic ARP Inspection (DAI) employed in a network switch? (Choose 3 best answers)
     * "Which of the following is true about Dynamic ARP Inspection (DAI) employed in a network switch? (Choose 3 best answers)"
     */
    public void onCheckedQuestion5() {
        // Figure out if the user chose "Intercept and examine all ARP request and response packets in a subnet and discard packets with invalid IP-to-MAC address bindings" answer
        CheckBox Answer_5_1_CheckBox = (CheckBox) findViewById(R.id.answer_5_1_checkbox);
        boolean hasAnswer_5_1_CheckBox = Answer_5_1_CheckBox.isChecked();

        if (hasAnswer_5_1_CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Prevents STP attacks" answer
        CheckBox Answer_5_2_CheckBox = (CheckBox) findViewById(R.id.answer_5_2_checkbox);
        boolean hasAnswer_5_2_CheckBox = Answer_5_2_CheckBox.isChecked();

        if (hasAnswer_5_2_CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "DAI can prevent common man-in-the-middle (MIM) attacks such as ARP cache poisoning" answer
        CheckBox Answer_5_3_CheckBox = (CheckBox) findViewById(R.id.answer_5_3_checkbox);
        boolean hasAnswer_5_3_CheckBox = Answer_5_3_CheckBox.isChecked();

        if (hasAnswer_5_3_CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Prevents mis-configuration of client IP addresses" answer
        CheckBox Answer_5_4_CheckBox = (CheckBox) findViewById(R.id.answer_5_4_checkbox);
        boolean hasAnswer_5_4_CheckBox = Answer_5_4_CheckBox.isChecked();

        if (hasAnswer_5_4_CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Prevents CAM table overflows" answer
        CheckBox Answer_5_5_CheckBox = (CheckBox) findViewById(R.id.answer_5_5_checkbox);
        boolean hasAnswer_5_5_CheckBox = Answer_5_5_CheckBox.isChecked();

        if (hasAnswer_5_5_CheckBox) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 6
     * Which one of the following types of attack intentionally introduced a back door to a system?
     * "Which one of the following types of attack intentionally introduced a back door to a system?"
     */
    public void onCheckedQuestion6() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_6);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.distribution_attack_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.distribution_attack_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.passive_attack_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.active_attack_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.close_in_attack_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.insider_attack_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 7
     * An organization screens its employees for any previous criminal records, as part of implementation of organizational security. It may be categorized as:
     * "An organization screens its employees for any previous criminal records, as part of implementation of organizational security. It may be categorized as: "
     */
    public void onCheckedQuestion7() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_7);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.administrative_security_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.administrative_security_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.physical_security_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.logical_security_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.vulnerability_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 8
     * Which three of the following are the Confidentiality attack strategies? (Choose 3 best answers)
     * "Which three of the following are the Confidentiality attack strategies? (Choose 3 best answers)"
     */
    public void onCheckedQuestion8() {
        // Figure out if the user chose "Packet capture" answer
        CheckBox PacketCaptureCheckBox = (CheckBox) findViewById(R.id.packet_capture_checkbox);
        boolean hasPacketCaptureCheckBox = PacketCaptureCheckBox.isChecked();

        if (hasPacketCaptureCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Dumpster driving" answer
        CheckBox DumpsterDrivingCheckBox = (CheckBox) findViewById(R.id.dumpster_driving_8_checkbox);
        boolean hasDumpsterDrivingCheckBox = DumpsterDrivingCheckBox.isChecked();

        if (hasDumpsterDrivingCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Social engineering" answer
        CheckBox SocialEngineeringCheckBox = (CheckBox) findViewById(R.id.social_engineering_8_checkbox);
        boolean hasSocialEngineeringCheckBox = SocialEngineeringCheckBox.isChecked();

        if (hasSocialEngineeringCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Password attack" answer
        CheckBox PasswordAttackCheckBox = (CheckBox) findViewById(R.id.password_checkbox);
        boolean hasPasswordAttackCheckBox = PasswordAttackCheckBox.isChecked();

        if (hasPasswordAttackCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Botnet" answer
        CheckBox BotnetCheckBox = (CheckBox) findViewById(R.id.botnet_checkbox);
        boolean hasBotnetCheckBox = BotnetCheckBox.isChecked();

        if (hasBotnetCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "TCPSYN Flood" answer
        CheckBox TCPSYNFloodCheckBox = (CheckBox) findViewById(R.id.tcpsyn_checkbox);
        boolean hasTCPSYNFloodCheckBox = TCPSYNFloodCheckBox.isChecked();

        if (hasTCPSYNFloodCheckBox) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 9
     * Which of the following are the Integrity attacks? (Choose 3 best answers)
     * "Which of the following are the Integrity attacks? (Choose 3 best answers)"
     */
    public void onCheckedQuestion9() {
        // Figure out if the user chose "Data diddling" answer
        CheckBox DataDiddlingCheckBox = (CheckBox) findViewById(R.id.data_diddling_checkbox);
        boolean hasDataDiddlingCheckBox = DataDiddlingCheckBox.isChecked();

        if (hasDataDiddlingCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Password attack" answer
        CheckBox PasswordAttackCheckBox = (CheckBox) findViewById(R.id.password_attack_9_checkbox);
        boolean hasPasswordAttackCheckBox = PasswordAttackCheckBox.isChecked();

        if (hasPasswordAttackCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Botnet" answer
        CheckBox BotnetCheckBox = (CheckBox) findViewById(R.id.botnet_9_checkbox);
        boolean hasBotnetCheckBox = BotnetCheckBox.isChecked();

        if (hasBotnetCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Social engineering" answer
        CheckBox SocialEngineeringCheckBox = (CheckBox) findViewById(R.id.social_engineering_9_checkbox);
        boolean hasSocialEngineeringCheckBox = SocialEngineeringCheckBox.isChecked();

        if (hasSocialEngineeringCheckBox) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 10
     * Which of the following are the attacks on availability of a resource? (Choose 2 best answers)
     * "Which of the following are the attacks on availability of a resource? (Choose 2 best answers)"
     */
    public void onCheckedQuestion10() {
        // Figure out if the user chose "Denial of Service" answer
        CheckBox DenialOfServiceCheckBox = (CheckBox) findViewById(R.id.denial_of_service_checkbox);
        boolean hasDenialOfServiceCheckBox = DenialOfServiceCheckBox.isChecked();

        if (hasDenialOfServiceCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "TCPSYN Flood" answer
        CheckBox TCPSYNFloodCheckBox = (CheckBox) findViewById(R.id.tcpsyn_flood_10_checkbox);
        boolean hasTCPSYNFloodCheckBox = TCPSYNFloodCheckBox.isChecked();

        if (hasTCPSYNFloodCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Social engineering" answer
        CheckBox SocialEngineeringCheckBox = (CheckBox) findViewById(R.id.social_engineering_10_checkbox);
        boolean hasSocialEngineeringCheckBox = SocialEngineeringCheckBox.isChecked();

        if (hasSocialEngineeringCheckBox) {
            increment_score();
        }
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayResult(String result) {
        TextView testResultTextView = (TextView) findViewById(R.id.test_result_text_view);
        testResultTextView.setText(result);
    }

    /**
     * This method is called when user selected the correct answer.
     * Added +1 to score for each correct answer
     */
    private int increment_score() {
        score = ++score;
        return score;
    }
}