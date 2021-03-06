/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.f1x.api.message.fields;

// Generated by org.f1x.tools.DictionaryGenerator from QuickFIX dictionary
public enum StipulationType implements org.f1x.api.message.types.StringEnum {
	AMT("AMT"),
	AUTO_REINVESTMENT_AT_OR_BETTER("AUTOREINV"),
	BANK_QUALIFIED("BANKQUAL"),
	BARGAIN_CONDITIONS("BGNCON"),
	COUPON_RANGE("COUPON"),
	ISO_CURRENCY_CODE("CURRENCY"),
	CUSTOM_START_END_DATE("CUSTOMDATE"),
	GEOGRAPHICS_AND_PERCENT_RANGE("GEOG"),
	VALUATION_DISCOUNT("HAIRCUT"),
	INSURED("INSURED"),
	YEAR_OR_YEAR_MONTH_OF_ISSUE("ISSUE"),
	ISSUERS_TICKER("ISSUER"),
	ISSUE_SIZE_RANGE("ISSUESIZE"),
	LOOKBACK_DAYS("LOOKBACK"),
	EXPLICIT_LOT_IDENTIFIER("LOT"),
	LOT_VARIANCE("LOTVAR"),
	MATURITY_YEAR_AND_MONTH("MAT"),
	MATURITY_RANGE("MATURITY"),
	MAXIMUM_SUBSTITUTIONS("MAXSUBS"),
	MINIMUM_QUANTITY("MINQTY"),
	MINIMUM_INCREMENT("MININCR"),
	MINIMUM_DENOMINATION("MINDNOM"),
	PAYMENT_FREQUENCY_CALENDAR("PAYFREQ"),
	NUMBER_OF_PIECES("PIECES"),
	POOLS_MAXIMUM("PMAX"),
	POOLS_PER_MILLION("PPM"),
	POOLS_PER_LOT("PPL"),
	POOLS_PER_TRADE("PPT"),
	PRICE_RANGE("PRICE"),
	PRICING_FREQUENCY("PRICEFREQ"),
	PRODUCTION_YEAR("PROD"),
	CALL_PROTECTION("PROTECT"),
	PURPOSE("PURPOSE"),
	BENCHMARK_PRICE_SOURCE("PXSOURCE"),
	RATING_SOURCE_AND_RANGE("RATING"),
	RESTRICTED("RESTRICTED"),
	MARKET_SECTOR("SECTOR"),
	SECURITYTYPE_INCLUDED_OR_EXCLUDED("SECTYPE"),
	STRUCTURE("STRUCT"),
	SUBSTITUTIONS_FREQUENCY("SUBSFREQ"),
	SUBSTITUTIONS_LEFT("SUBSLEFT"),
	FREEFORM_TEXT("TEXT"),
	TRADE_VARIANCE("TRDVAR"),
	WEIGHTED_AVERAGE_COUPON("WAC"),
	WEIGHTED_AVERAGE_LIFE_COUPON("WAL"),
	WEIGHTED_AVERAGE_LOAN_AGE("WALA"),
	WEIGHTED_AVERAGE_MATURITY("WAM"),
	WHOLE_POOL("WHOLE"),
	YIELD_RANGE("YIELD"),
	SINGLE_MONTHLY_MORTALITY("SMM"),
	CONSTANT_PREPAYMENT_RATE("CPR"),
	CONSTANT_PREPAYMENT_YIELD("CPY"),
	CONSTANT_PREPAYMENT_PENALTY("CPP"),
	ABSOLUTE_PREPAYMENT_SPEED("ABS"),
	MONTHLY_PREPAYMENT_RATE("MPR"),
	PERCENT_OF_BMA_PREPAYMENT_CURVE("PSA"),
	PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE("PPC"),
	PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE("MHP"),
	FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE("HEP");

	private final String code;

	StipulationType (String code) {
		this.code  = code;
		bytes = code.getBytes();
	}

	public String getCode() { return code; }

	private final byte[] bytes;
	public byte[] getBytes() { return bytes; }


	public static StipulationType parse(String s) {
		switch(s) {
			case "AMT" : return AMT;
			case "AUTOREINV" : return AUTO_REINVESTMENT_AT_OR_BETTER;
			case "BANKQUAL" : return BANK_QUALIFIED;
			case "BGNCON" : return BARGAIN_CONDITIONS;
			case "COUPON" : return COUPON_RANGE;
			case "CURRENCY" : return ISO_CURRENCY_CODE;
			case "CUSTOMDATE" : return CUSTOM_START_END_DATE;
			case "GEOG" : return GEOGRAPHICS_AND_PERCENT_RANGE;
			case "HAIRCUT" : return VALUATION_DISCOUNT;
			case "INSURED" : return INSURED;
			case "ISSUE" : return YEAR_OR_YEAR_MONTH_OF_ISSUE;
			case "ISSUER" : return ISSUERS_TICKER;
			case "ISSUESIZE" : return ISSUE_SIZE_RANGE;
			case "LOOKBACK" : return LOOKBACK_DAYS;
			case "LOT" : return EXPLICIT_LOT_IDENTIFIER;
			case "LOTVAR" : return LOT_VARIANCE;
			case "MAT" : return MATURITY_YEAR_AND_MONTH;
			case "MATURITY" : return MATURITY_RANGE;
			case "MAXSUBS" : return MAXIMUM_SUBSTITUTIONS;
			case "MINQTY" : return MINIMUM_QUANTITY;
			case "MININCR" : return MINIMUM_INCREMENT;
			case "MINDNOM" : return MINIMUM_DENOMINATION;
			case "PAYFREQ" : return PAYMENT_FREQUENCY_CALENDAR;
			case "PIECES" : return NUMBER_OF_PIECES;
			case "PMAX" : return POOLS_MAXIMUM;
			case "PPM" : return POOLS_PER_MILLION;
			case "PPL" : return POOLS_PER_LOT;
			case "PPT" : return POOLS_PER_TRADE;
			case "PRICE" : return PRICE_RANGE;
			case "PRICEFREQ" : return PRICING_FREQUENCY;
			case "PROD" : return PRODUCTION_YEAR;
			case "PROTECT" : return CALL_PROTECTION;
			case "PURPOSE" : return PURPOSE;
			case "PXSOURCE" : return BENCHMARK_PRICE_SOURCE;
			case "RATING" : return RATING_SOURCE_AND_RANGE;
			case "RESTRICTED" : return RESTRICTED;
			case "SECTOR" : return MARKET_SECTOR;
			case "SECTYPE" : return SECURITYTYPE_INCLUDED_OR_EXCLUDED;
			case "STRUCT" : return STRUCTURE;
			case "SUBSFREQ" : return SUBSTITUTIONS_FREQUENCY;
			case "SUBSLEFT" : return SUBSTITUTIONS_LEFT;
			case "TEXT" : return FREEFORM_TEXT;
			case "TRDVAR" : return TRADE_VARIANCE;
			case "WAC" : return WEIGHTED_AVERAGE_COUPON;
			case "WAL" : return WEIGHTED_AVERAGE_LIFE_COUPON;
			case "WALA" : return WEIGHTED_AVERAGE_LOAN_AGE;
			case "WAM" : return WEIGHTED_AVERAGE_MATURITY;
			case "WHOLE" : return WHOLE_POOL;
			case "YIELD" : return YIELD_RANGE;
			case "SMM" : return SINGLE_MONTHLY_MORTALITY;
			case "CPR" : return CONSTANT_PREPAYMENT_RATE;
			case "CPY" : return CONSTANT_PREPAYMENT_YIELD;
			case "CPP" : return CONSTANT_PREPAYMENT_PENALTY;
			case "ABS" : return ABSOLUTE_PREPAYMENT_SPEED;
			case "MPR" : return MONTHLY_PREPAYMENT_RATE;
			case "PSA" : return PERCENT_OF_BMA_PREPAYMENT_CURVE;
			case "PPC" : return PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE;
			case "MHP" : return PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE;
			case "HEP" : return FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE;
		}
		return null;
	}

}