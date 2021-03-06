/*
*  By downloading the PROGRAM you agree to the following terms of use:
*  
*  BROAD INSTITUTE - SOFTWARE LICENSE AGREEMENT - FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
*  
*  This Agreement is made between the Broad Institute, Inc. with a principal address at 7 Cambridge Center, Cambridge, MA 02142 (BROAD) and the LICENSEE and is effective at the date the downloading is completed (EFFECTIVE DATE).
*  
*  WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
*  WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
*  NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
*  
*  1. DEFINITIONS
*  1.1 PROGRAM shall mean copyright in the object code and source code known as GATK2 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute/GATK on the EFFECTIVE DATE.
*  
*  2. LICENSE
*  2.1   Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. 
*  The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only.  For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
*  2.2  No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD.  LICENSEE shall ensure that all of its users agree to the terms of this Agreement.  LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
*  2.3  License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.  
*  
*  3. OWNERSHIP OF INTELLECTUAL PROPERTY 
*  LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies.  LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
*  Copyright 2012 Broad Institute, Inc.
*  Notice of attribution:  The GATK2 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
*  LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
*  
*  4. INDEMNIFICATION
*  LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
*  
*  5. NO REPRESENTATIONS OR WARRANTIES
*  THE PROGRAM IS DELIVERED AS IS.  BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
*  IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
*  
*  6. ASSIGNMENT
*  This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
*  
*  7. MISCELLANEOUS
*  7.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
*  7.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
*  7.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
*  7.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested.  All notices under this Agreement shall be deemed effective upon receipt. 
*  7.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter. 
*  7.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
*  7.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.gatk.utils.recalibration;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;
import org.apache.log4j.Logger;
import org.broadinstitute.gatk.engine.report.GATKReport;
import org.broadinstitute.gatk.engine.report.GATKReportTable;
import org.broadinstitute.gatk.tools.walkers.bqsr.RecalibrationArgumentCollection;
import org.broadinstitute.gatk.utils.classloader.JVMUtils;
import org.broadinstitute.gatk.utils.recalibration.covariates.*;
import org.broadinstitute.gatk.utils.BaseUtils;
import org.broadinstitute.gatk.utils.R.RScriptExecutor;
import org.broadinstitute.gatk.utils.Utils;
import org.broadinstitute.gatk.utils.classloader.PluginManager;
import org.broadinstitute.gatk.utils.collections.NestedIntegerArray;
import org.broadinstitute.gatk.utils.collections.Pair;
import org.broadinstitute.gatk.utils.exceptions.DynamicClassResolutionException;
import org.broadinstitute.gatk.utils.exceptions.ReviewedGATKException;
import org.broadinstitute.gatk.utils.exceptions.UserException;
import org.broadinstitute.gatk.utils.io.Resource;
import org.broadinstitute.gatk.utils.sam.GATKSAMReadGroupRecord;
import org.broadinstitute.gatk.utils.sam.GATKSAMRecord;
import org.broadinstitute.gatk.utils.sam.ReadUtils;

import java.io.*;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: rpoplin
 * Date: Nov 6, 2009
 *
 * This helper class holds the data HashMap as well as submaps that represent the marginal distributions collapsed over all needed dimensions.
 * It also has static methods that are used to perform the various solid recalibration modes that attempt to correct the reference bias.
 * This class holds the parsing methods that are shared between BaseRecalibrator and PrintReads.
 */

public class RecalUtils {
    public final static String ARGUMENT_REPORT_TABLE_TITLE = "Arguments";
    public final static String QUANTIZED_REPORT_TABLE_TITLE = "Quantized";
    public final static String READGROUP_REPORT_TABLE_TITLE = "RecalTable0";
    public final static String QUALITY_SCORE_REPORT_TABLE_TITLE = "RecalTable1";
    public final static String ALL_COVARIATES_REPORT_TABLE_TITLE = "RecalTable2";

    public final static String ARGUMENT_COLUMN_NAME = "Argument";
    public final static String ARGUMENT_VALUE_COLUMN_NAME = "Value";
    public final static String QUANTIZED_VALUE_COLUMN_NAME = "QuantizedScore";
    public static final String QUANTIZED_COUNT_COLUMN_NAME = "Count";
    public final static String READGROUP_COLUMN_NAME = "ReadGroup";
    public final static String EVENT_TYPE_COLUMN_NAME = "EventType";
    public final static String EMPIRICAL_QUALITY_COLUMN_NAME = "EmpiricalQuality";
    public final static String ESTIMATED_Q_REPORTED_COLUMN_NAME = "EstimatedQReported";
    public final static String QUALITY_SCORE_COLUMN_NAME = "QualityScore";
    public final static String COVARIATE_VALUE_COLUMN_NAME = "CovariateValue";
    public final static String COVARIATE_NAME_COLUMN_NAME = "CovariateName";
    public final static String NUMBER_OBSERVATIONS_COLUMN_NAME = "Observations";
    public final static String NUMBER_ERRORS_COLUMN_NAME = "Errors";

    private final static String COLOR_SPACE_ATTRIBUTE_TAG = "CS"; // The tag that holds the color space for SOLID bams
    private final static String COLOR_SPACE_INCONSISTENCY_TAG = "ZC"; // A new tag made up for the recalibrator which will hold an array of ints which say if this base is inconsistent with its color
    private static boolean warnUserNullPlatform = false;

    private static final String SCRIPT_FILE = "BQSR.R";

    private static final Pair<String, String> covariateValue     = new Pair<String, String>(RecalUtils.COVARIATE_VALUE_COLUMN_NAME, "%s");
    private static final Pair<String, String> covariateName      = new Pair<String, String>(RecalUtils.COVARIATE_NAME_COLUMN_NAME, "%s");
    private static final Pair<String, String> eventType          = new Pair<String, String>(RecalUtils.EVENT_TYPE_COLUMN_NAME, "%s");
    private static final Pair<String, String> empiricalQuality   = new Pair<String, String>(RecalUtils.EMPIRICAL_QUALITY_COLUMN_NAME, "%.4f");
    private static final Pair<String, String> estimatedQReported = new Pair<String, String>(RecalUtils.ESTIMATED_Q_REPORTED_COLUMN_NAME, "%.4f");
    private static final Pair<String, String> nObservations      = new Pair<String, String>(RecalUtils.NUMBER_OBSERVATIONS_COLUMN_NAME, "%d");
    private static final Pair<String, String> nErrors            = new Pair<String, String>(RecalUtils.NUMBER_ERRORS_COLUMN_NAME, "%.2f");

    /**
     * Generates two lists : required covariates and optional covariates based on the user's requests.
     *
     * Performs the following tasks in order:
     *  1. Adds all requierd covariates in order
     *  2. Check if the user asked to use the standard covariates and adds them all if that's the case
     *  3. Adds all covariates requested by the user that were not already added by the two previous steps
     *
     * @param argumentCollection the argument collection object for the recalibration walker
     * @return a pair of ordered lists : required covariates (first) and optional covariates (second)
     */
    public static Pair<ArrayList<Covariate>, ArrayList<Covariate>> initializeCovariates(RecalibrationArgumentCollection argumentCollection) {
        final List<Class<? extends Covariate>> covariateClasses = new PluginManager<Covariate>(Covariate.class).getPlugins();
        final List<Class<? extends RequiredCovariate>> requiredClasses = new PluginManager<RequiredCovariate>(RequiredCovariate.class).getPlugins();
        final List<Class<? extends StandardCovariate>> standardClasses = new PluginManager<StandardCovariate>(StandardCovariate.class).getPlugins();

        final ArrayList<Covariate> requiredCovariates = addRequiredCovariatesToList(requiredClasses); // add the required covariates
        ArrayList<Covariate> optionalCovariates = new ArrayList<Covariate>();
        if (!argumentCollection.DO_NOT_USE_STANDARD_COVARIATES)
            optionalCovariates = addStandardCovariatesToList(standardClasses); // add the standard covariates if -standard was specified by the user

        // parse the -cov arguments that were provided, skipping over the ones already specified
        if (argumentCollection.COVARIATES != null) {
            for (String requestedCovariateString : argumentCollection.COVARIATES) {
                // help the transition from BQSR v1 to BQSR v2
                if ( requestedCovariateString.equals("DinucCovariate") )
                    throw new UserException.CommandLineException("DinucCovariate has been retired.  Please use its successor covariate " +
                            "ContextCovariate instead, which includes the 2 bp (dinuc) substitution model of the retired DinucCovariate " +
                            "as well as an indel context to model the indel error rates");

                boolean foundClass = false;
                for (Class<? extends Covariate> covClass : covariateClasses) {
                    if (requestedCovariateString.equalsIgnoreCase(covClass.getSimpleName())) { // -cov argument matches the class name for an implementing class
                        foundClass = true;
                        if (!requiredClasses.contains(covClass) &&
                                (argumentCollection.DO_NOT_USE_STANDARD_COVARIATES || !standardClasses.contains(covClass))) {
                            try {
                                final Covariate covariate = covClass.newInstance(); // now that we've found a matching class, try to instantiate it
                                optionalCovariates.add(covariate);
                            } catch (Exception e) {
                                throw new DynamicClassResolutionException(covClass, e);
                            }
                        }
                    }
                }

                if (!foundClass) {
                    throw new UserException.CommandLineException("The requested covariate type (" + requestedCovariateString + ") isn't a valid covariate option. Use --list to see possible covariates.");
                }
            }
        }
        return new Pair<ArrayList<Covariate>, ArrayList<Covariate>>(requiredCovariates, optionalCovariates);
    }

    /**
     * Adds the required covariates to a covariate list
     *
     * Note: this method really only checks if the classes object has the expected number of required covariates, then add them by hand.
     *
     * @param classes list of classes to add to the covariate list
     * @return the covariate list
     */
    private static ArrayList<Covariate> addRequiredCovariatesToList(List<Class<? extends RequiredCovariate>> classes) {
        ArrayList<Covariate> dest = new ArrayList<Covariate>(classes.size());
        if (classes.size() != 2)
            throw new ReviewedGATKException("The number of required covariates has changed, this is a hard change in the code and needs to be inspected");

        dest.add(new ReadGroupCovariate()); // enforce the order with RG first and QS next.
        dest.add(new QualityScoreCovariate());
        return dest;
    }

    /**
     * Adds the standard covariates to a covariate list
     *
     * @param classes list of classes to add to the covariate list
     * @return the covariate list
     */
    private static ArrayList<Covariate> addStandardCovariatesToList(List<Class<? extends StandardCovariate>> classes) {
        ArrayList<Covariate> dest = new ArrayList<Covariate>(classes.size());
        for (Class<?> covClass : classes) {
            try {
                final Covariate covariate = (Covariate) covClass.newInstance();
                dest.add(covariate);
            } catch (Exception e) {
                throw new DynamicClassResolutionException(covClass, e);
            }
        }
        return dest;
    }

    /**
     * Print a list of all available covariates to logger as info
     *
     * @param logger
     */
    public static void listAvailableCovariates(final Logger logger) {
        logger.info("Available covariates:");
        for (final Class<? extends Covariate> covClass : new PluginManager<Covariate>(Covariate.class).getPlugins()) {
            logger.info(String.format("\t%30s\t%s", covClass.getSimpleName(), JVMUtils.classInterfaces(covClass)));
        }
    }

    /**
     * Component used to print out csv representation of the reports that can be use to perform analysis in
     * external tools. E.g. generate plots using R scripts.
     * <p/>
     * A header is always printed into the output stream (or file) when the printer is created. Then you only need
     * to call {@link #print(RecalibrationReport,String) print} for each report you want to include in the csv file.
     * Once finished, you close the printer calling {@link #close() close}
     *
     */
    private static class CsvPrinter {

        private final PrintStream ps;
        private final Covariate[] covariates;

        /**
         * Constructs a printer redirected to an output file.
         * @param out the output file.
         * @param c covariates to print out.
         * @throws FileNotFoundException if the file could not be created anew.
         */
        protected CsvPrinter(final File out, final Covariate ... c)
                throws FileNotFoundException {
            this(new FileOutputStream(out), c);
        }

        /**
         * Constructs a printer redirected to an output stream
         * @param os the output.
         * @param c  covariates to print out.
         */
        protected CsvPrinter(final OutputStream os, final Covariate ... c) {
            covariates = c == null ? new Covariate[0] : c.clone();
            ps = new PrintStream(os);
            printHeader();
        }

        /**
         * Prints the header out.
         * <p/>
         * Should only be invoked at creation.
         */
        protected void printHeader() {
            RecalUtils.printHeader(ps);
        }

        /**
         * Prints out a report into the csv file.
         *
         *
         * @param report the report to print out.
         * @param mode  the report associated mode. (typically ORIGINAL, RECALIBRATED
         */
        public void print(final RecalibrationReport report, final String mode) {
            RecalUtils.writeCSV(ps,report.getRecalibrationTables(),mode,covariates,false);
        }

        /**
         * Close the csv printer.
         *
         * No further output will be allowed or take place after calling this method.
         */
        public void close() {
            ps.close();
        }

    }

    /**
     * Returns a csv output printer.
     *
     * @param out the output file. It will be overridden
     * @param c list of covariates to print out.
     *
     * @throws FileNotFoundException if <code>out</code> could not be created anew.
     *
     * @return never <code>null</code>
     */
    protected static CsvPrinter csvPrinter(final File out, final Covariate ... c)
        throws FileNotFoundException
    {
        if (c == null) {
            throw new IllegalArgumentException("the input covariate array cannot be null");
        }
        return new CsvPrinter(out,c);
    }

    /**
     * Prints out a collection of reports into a file in Csv format in a way
     * that can be used by R scripts (such as the plot generator script).
     * <p/>
     * The set of covariates is take as the minimum common set from all reports.
     *
     * @param out the output file. It will be overridden.
     * @param reports map where keys are the unique 'mode' (ORIGINAL, RECALIBRATED, ...)
     *                of each report and the corresponding value the report itself.
     * @throws FileNotFoundException if <code>out</code> could not be created anew.
     */
    public static void generateCsv(final File out, final Map<String, RecalibrationReport> reports)
            throws FileNotFoundException {
        if (reports.size() == 0) {
            writeCsv(out, reports, new Covariate[0]);
        } else {
            final Iterator<RecalibrationReport> rit = reports.values().iterator();
            final RecalibrationReport first = rit.next();
            final Covariate[] firstCovariates = first.getRequestedCovariates();
            final Set<Covariate> covariates = new LinkedHashSet<>();
            Utils.addAll(covariates,firstCovariates);
            while (rit.hasNext() && covariates.size() > 0) {
                final Covariate[] nextCovariates = rit.next().getRequestedCovariates();
                final Set<String> nextCovariateNames = new LinkedHashSet<String>(nextCovariates.length);
                for (final Covariate nc : nextCovariates) {
                    nextCovariateNames.add(nc.getClass().getSimpleName());
                }
                final Iterator<Covariate> cit = covariates.iterator();
                while (cit.hasNext()) {
                    if (!nextCovariateNames.contains(cit.next().getClass().getSimpleName())) {
                        cit.remove();
                    }
                }
            }
            writeCsv(out, reports, covariates.toArray(new Covariate[covariates.size()]));
        }
    }

    /**
     * Print out a collection of reports into a file in Csv format in a way
     * that can be used by R scripts (such as the plot generator script).
     *
     * @param out
     * @param reports map where keys are the unique 'mode' (ORIGINAL, RECALIBRATED, ...)
     *                of each report and the corresponding value the report itself.
     * @param c the covariates to print out.
     * @throws FileNotFoundException if <code>out</code> could not be created anew.
     */
    private static void writeCsv(final File out,
            final Map<String, RecalibrationReport> reports, final Covariate[] c)
        throws FileNotFoundException {
        final CsvPrinter p = csvPrinter(out,c);
        for (Map.Entry<String,RecalibrationReport> e : reports.entrySet()) {
            p.print(e.getValue(),e.getKey());
        }
        p.close();
    }

    public enum SOLID_RECAL_MODE {
        /**
         * Treat reference inserted bases as reference matching bases. Very unsafe!
         */
        DO_NOTHING,
        /**
         * Set reference inserted bases and the previous base (because of color space alignment details) to Q0. This is the default option.
         */
        SET_Q_ZERO,
        /**
         * In addition to setting the quality scores to zero, also set the base itself to 'N'. This is useful to visualize in IGV.
         */
        SET_Q_ZERO_BASE_N,
        /**
         * Look at the color quality scores and probabilistically decide to change the reference inserted base to be the base which is implied by the original color space instead of the reference.
         */
        REMOVE_REF_BIAS;
        
        public static SOLID_RECAL_MODE recalModeFromString(String recalMode) {
            if (recalMode.equals("DO_NOTHING"))
                return SOLID_RECAL_MODE.DO_NOTHING;
            if (recalMode.equals("SET_Q_ZERO"))
                return SOLID_RECAL_MODE.SET_Q_ZERO;
            if (recalMode.equals("SET_Q_ZERO_BASE_N"))
                return SOLID_RECAL_MODE.SET_Q_ZERO_BASE_N;
            if (recalMode.equals("REMOVE_REF_BIAS"))
                return SOLID_RECAL_MODE.REMOVE_REF_BIAS;

            throw new UserException.BadArgumentValue(recalMode, "is not a valid SOLID_RECAL_MODE value");
        }
    }

    public enum SOLID_NOCALL_STRATEGY {
        /**
         * When a no call is detected throw an exception to alert the user that recalibrating this SOLiD data is unsafe. This is the default option.
         */
        THROW_EXCEPTION,
        /**
         * Leave the read in the output bam completely untouched. This mode is only okay if the no calls are very rare.
         */
        LEAVE_READ_UNRECALIBRATED,
        /**
         * Mark these reads as failing vendor quality checks so they can be filtered out by downstream analyses.
         */
        PURGE_READ;

        public static SOLID_NOCALL_STRATEGY nocallStrategyFromString(String nocallStrategy) {
            if (nocallStrategy.equals("THROW_EXCEPTION"))
                return SOLID_NOCALL_STRATEGY.THROW_EXCEPTION;
            if (nocallStrategy.equals("LEAVE_READ_UNRECALIBRATED"))
                return SOLID_NOCALL_STRATEGY.LEAVE_READ_UNRECALIBRATED;
            if (nocallStrategy.equals("PURGE_READ"))
                return SOLID_NOCALL_STRATEGY.PURGE_READ;

            throw new UserException.BadArgumentValue(nocallStrategy, "is not a valid SOLID_NOCALL_STRATEGY value");
        }
    }

    private static List<GATKReportTable> generateReportTables(final RecalibrationTables recalibrationTables, final Covariate[] requestedCovariates, boolean sortByCols) {
        List<GATKReportTable> result = new LinkedList<GATKReportTable>();
        int reportTableIndex = 0;
        int rowIndex = 0;
        final Map<Covariate, String> covariateNameMap = new HashMap<Covariate, String>(requestedCovariates.length);
        for (final Covariate covariate : requestedCovariates)
            covariateNameMap.put(covariate, parseCovariateName(covariate));

        for (int tableIndex = 0; tableIndex < recalibrationTables.numTables(); tableIndex++) {

            final ArrayList<Pair<String, String>> columnNames = new ArrayList<Pair<String, String>>(); // initialize the array to hold the column names
            columnNames.add(new Pair<String, String>(covariateNameMap.get(requestedCovariates[0]), "%s")); // save the required covariate name so we can reference it in the future
            if (tableIndex != RecalibrationTables.TableType.READ_GROUP_TABLE.ordinal()) {
                columnNames.add(new Pair<String, String>(covariateNameMap.get(requestedCovariates[1]), "%s")); // save the required covariate name so we can reference it in the future
                if (tableIndex >= RecalibrationTables.TableType.OPTIONAL_COVARIATE_TABLES_START.ordinal()) {
                    columnNames.add(covariateValue);
                    columnNames.add(covariateName);
                }
            }

            columnNames.add(eventType); // the order of these column names is important here
            columnNames.add(empiricalQuality);
            if (tableIndex == RecalibrationTables.TableType.READ_GROUP_TABLE.ordinal())
                columnNames.add(estimatedQReported); // only the read group table needs the estimated Q reported
            columnNames.add(nObservations);
            columnNames.add(nErrors);

            final GATKReportTable reportTable;
            if (tableIndex <= RecalibrationTables.TableType.OPTIONAL_COVARIATE_TABLES_START.ordinal()) {
                if(sortByCols) {
                    reportTable = new GATKReportTable("RecalTable" + reportTableIndex++, "", columnNames.size(), GATKReportTable.TableSortingWay.SORT_BY_COLUMN);
                } else {
                    reportTable = new GATKReportTable("RecalTable" + reportTableIndex++, "", columnNames.size(), GATKReportTable.TableSortingWay.DO_NOT_SORT);
                }
                for (final Pair<String, String> columnName : columnNames)
                    reportTable.addColumn(columnName.getFirst(), columnName.getSecond());
                rowIndex = 0; // reset the row index since we're starting with a new table
            } else {
                reportTable = result.get(RecalibrationTables.TableType.OPTIONAL_COVARIATE_TABLES_START.ordinal());
            }

            final NestedIntegerArray<RecalDatum> table = recalibrationTables.getTable(tableIndex);
            for (final NestedIntegerArray.Leaf row : table.getAllLeaves()) {
                final RecalDatum datum = (RecalDatum)row.value;
                final int[] keys = row.keys;

                int columnIndex = 0;
                int keyIndex = 0;
                reportTable.set(rowIndex, columnNames.get(columnIndex++).getFirst(), requestedCovariates[0].formatKey(keys[keyIndex++]));
                if (tableIndex != RecalibrationTables.TableType.READ_GROUP_TABLE.ordinal()) {
                    reportTable.set(rowIndex, columnNames.get(columnIndex++).getFirst(), requestedCovariates[1].formatKey(keys[keyIndex++]));
                    if (tableIndex >= RecalibrationTables.TableType.OPTIONAL_COVARIATE_TABLES_START.ordinal()) {
                        final Covariate covariate = requestedCovariates[tableIndex];

                        reportTable.set(rowIndex, columnNames.get(columnIndex++).getFirst(), covariate.formatKey(keys[keyIndex++]));
                        reportTable.set(rowIndex, columnNames.get(columnIndex++).getFirst(), covariateNameMap.get(covariate));
                    }
                }

                final EventType event = EventType.eventFrom(keys[keyIndex]);
                reportTable.set(rowIndex, columnNames.get(columnIndex++).getFirst(), event.toString());

                reportTable.set(rowIndex, columnNames.get(columnIndex++).getFirst(), datum.getEmpiricalQuality());
                if (tableIndex == RecalibrationTables.TableType.READ_GROUP_TABLE.ordinal())
                    reportTable.set(rowIndex, columnNames.get(columnIndex++).getFirst(), datum.getEstimatedQReported()); // we only add the estimated Q reported in the RG table
                reportTable.set(rowIndex, columnNames.get(columnIndex++).getFirst(), datum.getNumObservations());
                reportTable.set(rowIndex, columnNames.get(columnIndex).getFirst(), datum.getNumMismatches());

                rowIndex++;
            }
            result.add(reportTable);
        }

        return result;
    }

    private static String parseCovariateName(final Covariate covariate) {
        return covariate.getClass().getSimpleName().split("Covariate")[0];
    }

    /**
     * Return a human-readable string representing the used covariates
     *
     * @param requestedCovariates a vector of covariates
     * @return a non-null comma-separated string
     */
    public static String covariateNames(final Covariate[] requestedCovariates) {
        final List<String> names = new ArrayList<String>(requestedCovariates.length);
        for ( final Covariate cov : requestedCovariates )
            names.add(cov.getClass().getSimpleName());
        return Utils.join(",", names);
    }

    /**
     * Outputs the GATK report to RAC.RECAL_TABLE.
     *
     * @param RAC The list of shared command line arguments
     * @param quantizationInfo Quantization info
     * @param recalibrationTables Recalibration tables
     * @param requestedCovariates The list of requested covariates
     * @param sortByCols True to use GATKReportTable.TableSortingWay.SORT_BY_COLUMN, false to use GATKReportTable.TableSortingWay.DO_NOT_SORT
     */
    public static void outputRecalibrationReport(final RecalibrationArgumentCollection RAC, final QuantizationInfo quantizationInfo, final RecalibrationTables recalibrationTables, final Covariate[] requestedCovariates, boolean sortByCols) {
        final GATKReport report = createRecalibrationGATKReport(RAC.generateReportTable(covariateNames(requestedCovariates)), quantizationInfo.generateReportTable(sortByCols), generateReportTables(recalibrationTables, requestedCovariates, sortByCols));
        report.print(RAC.RECAL_TABLE);
    }

    /**
     * Creates a consolidated GATK report, first generating report tables. Report can then be written to a stream via GATKReport.print(PrintStream).
     *
     * @param argumentTable Argument table
     * @param quantizationInfo Quantization info
     * @param recalibrationTables Recalibration tables
     * @param requestedCovariates The list of requested covariates
     * @param sortByCols True to use GATKReportTable.TableSortingWay.SORT_BY_COLUMN, false to use GATKReportTable.TableSortingWay.DO_NOT_SORT
     * @return GATK report
     */
    public static GATKReport createRecalibrationGATKReport(final GATKReportTable argumentTable, final QuantizationInfo quantizationInfo, final RecalibrationTables recalibrationTables, final Covariate[] requestedCovariates, final boolean sortByCols) {
        return createRecalibrationGATKReport(argumentTable, quantizationInfo.generateReportTable(sortByCols), generateReportTables(recalibrationTables, requestedCovariates, sortByCols));
    }

    /**
     * Creates a consolidated GATK report from the tables. Report can then be written to a stream via GATKReport.print(PrintStream).
     *
     * @param argumentTable Argument table
     * @param quantizationTable Quantization Table
     * @param recalTables Other recal tables
     * @return GATK report
     */
    private static GATKReport createRecalibrationGATKReport(final GATKReportTable argumentTable, final GATKReportTable quantizationTable, final List<GATKReportTable> recalTables) {
        final GATKReport report = new GATKReport();
        report.addTable(argumentTable);
        report.addTable(quantizationTable);
        report.addTables(recalTables);
        return report;
    }

    /**                                                s
     * Write recalibration plots into a file
     *
     * @param csvFile location of the intermediary file
     * @param exampleReportFile where the report arguments are collected from.
     * @param output result plot file name.
     */
    public static void generatePlots(final File csvFile, final File exampleReportFile, final File output) {
        final RScriptExecutor executor = new RScriptExecutor();
        executor.setExceptOnError(true);
        executor.addScript(new Resource(SCRIPT_FILE, RecalUtils.class));
        executor.addArgs(csvFile.getAbsolutePath());
        executor.addArgs(exampleReportFile.getAbsolutePath());
        executor.addArgs(output.getAbsolutePath());
        Logger.getLogger(RecalUtils.class).debug("R command line: " + executor.getApproximateCommandLine());
        executor.exec();
    }

    private static void outputRecalibrationPlot(final File csvFile, final RecalibrationArgumentCollection RAC) {

        final RScriptExecutor executor = new RScriptExecutor();
        executor.addScript(new Resource(SCRIPT_FILE, RecalUtils.class));
        executor.addArgs(csvFile.getAbsolutePath());
        executor.addArgs(RAC.RECAL_TABLE_FILE.getAbsolutePath());
        executor.exec();
    }

    /**
     * Please use {@link #generateCsv(java.io.File, java.util.Map)} and {@link #generatePlots(java.io.File, java.io.File, java.io.File)} instead.
     *
     * @deprecated
     */
    @Deprecated
    public static void generateRecalibrationPlot(final RecalibrationArgumentCollection RAC, final RecalibrationTables original, final Covariate[] requestedCovariates) {
        generateRecalibrationPlot(RAC, original, null, requestedCovariates);
    }

    /**
     * Please use {@link #generateCsv(java.io.File, java.util.Map)} and {@link #generatePlots(java.io.File, java.io.File, java.io.File)} instead.
     *
     * @deprecated
     */
    @Deprecated
    public static void generateRecalibrationPlot(final RecalibrationArgumentCollection RAC, final RecalibrationTables original, final RecalibrationTables recalibrated, final Covariate[] requestedCovariates) {
        final PrintStream csvStream;
        final File csvTempFile = null;
        try {
            File csvTmpFile = File.createTempFile("BQSR",".csv");
            csvTmpFile.deleteOnExit();
            csvStream = new PrintStream(csvTmpFile);
        } catch (IOException e) {
            throw new UserException("Could not create temporary csv file", e);
        }

        if ( recalibrated != null )
            writeCSV(csvStream, recalibrated, "RECALIBRATED", requestedCovariates, true);
        writeCSV(csvStream, original, "ORIGINAL", requestedCovariates, recalibrated == null);
        csvStream.close();
        outputRecalibrationPlot(csvTempFile, RAC);
        csvTempFile.delete();
    }

    private static void writeCSV(final PrintStream deltaTableFile, final RecalibrationTables recalibrationTables, final String recalibrationMode, final Covariate[] requestedCovariates, final boolean printHeader) {

        final NestedIntegerArray<RecalDatum> deltaTable = createDeltaTable(recalibrationTables, requestedCovariates.length);

        // add the quality score table to the delta table
        final NestedIntegerArray<RecalDatum> qualTable = recalibrationTables.getQualityScoreTable();
        for (final NestedIntegerArray.Leaf leaf : qualTable.getAllLeaves()) { // go through every element in the covariates table to create the delta table
            final int[] newCovs = new int[4];
            newCovs[0] = leaf.keys[0];
            newCovs[1] = requestedCovariates.length; // replace the covariate name with an arbitrary (unused) index for QualityScore
            newCovs[2] = leaf.keys[1];
            newCovs[3] = leaf.keys[2];
            addToDeltaTable(deltaTable, newCovs, (RecalDatum)leaf.value); // add this covariate to the delta table
        }

        // add the optional covariates to the delta table
        for (int i = RecalibrationTables.TableType.OPTIONAL_COVARIATE_TABLES_START.ordinal(); i < requestedCovariates.length; i++) {
            final NestedIntegerArray<RecalDatum> covTable = recalibrationTables.getTable(i);
            for (final NestedIntegerArray.Leaf leaf : covTable.getAllLeaves()) {
                final int[] covs = new int[4];
                covs[0] = leaf.keys[0];
                covs[1] = i; // reset the quality score covariate to 0 from the keyset (so we aggregate all rows regardless of QS)
                covs[2] = leaf.keys[2];
                covs[3] = leaf.keys[3];
                addToDeltaTable(deltaTable, covs, (RecalDatum) leaf.value); // add this covariate to the delta table
            }
        }

        // output the csv file
        if (printHeader) {
            printHeader(deltaTableFile);
        }

        final Map<Covariate, String> covariateNameMap = new HashMap<Covariate, String>(requestedCovariates.length);
        for (final Covariate covariate : requestedCovariates)
            covariateNameMap.put(covariate, parseCovariateName(covariate));

        // print each data line
        for (final NestedIntegerArray.Leaf<RecalDatum> leaf : deltaTable.getAllLeaves()) {
            final List<Object> deltaKeys = generateValuesFromKeys(leaf.keys, requestedCovariates, covariateNameMap);
            final RecalDatum deltaDatum = leaf.value;
            deltaTableFile.print(Utils.join(",", deltaKeys));
            deltaTableFile.print("," + deltaDatum.stringForCSV());
            deltaTableFile.println("," + recalibrationMode);
        }
    }

    private static void printHeader(PrintStream out) {
        final List<String> header = new LinkedList<String>();
        header.add("ReadGroup");
        header.add("CovariateValue");
        header.add("CovariateName");
        header.add("EventType");
        header.add("Observations");
        header.add("Errors");
        header.add("EmpiricalQuality");
        header.add("AverageReportedQuality");
        header.add("Accuracy");
        header.add("Recalibration");
        out.println(Utils.join(",", header));
    }

    /*
     * Return an initialized nested integer array with appropriate dimensions for use with the delta tables
     *
     * @param recalibrationTables     the recal tables
     * @param numCovariates           the total number of covariates being used
     * @return a non-null nested integer array
     */
    @Requires("recalibrationTables != null && numCovariates > 0")
    @Ensures("result != null")
    private static NestedIntegerArray<RecalDatum> createDeltaTable(final RecalibrationTables recalibrationTables, final int numCovariates) {

        final int[] dimensionsForDeltaTable = new int[4];

        // initialize the dimensions with those of the qual table to start with
        final NestedIntegerArray<RecalDatum> qualTable = recalibrationTables.getQualityScoreTable();
        final int[] dimensionsOfQualTable = qualTable.getDimensions();
        dimensionsForDeltaTable[0] = dimensionsOfQualTable[0];    // num read groups
        dimensionsForDeltaTable[1] = numCovariates + 1;           // num covariates
        dimensionsForDeltaTable[2] = dimensionsOfQualTable[1];
        dimensionsForDeltaTable[3] = dimensionsOfQualTable[2];

        // now, update the dimensions based on the optional covariate tables as needed
        for ( int i = RecalibrationTables.TableType.OPTIONAL_COVARIATE_TABLES_START.ordinal(); i < numCovariates; i++ ) {
            final NestedIntegerArray<RecalDatum> covTable = recalibrationTables.getTable(i);
            final int[] dimensionsOfCovTable = covTable.getDimensions();
            dimensionsForDeltaTable[2] = Math.max(dimensionsForDeltaTable[2], dimensionsOfCovTable[2]);
            dimensionsForDeltaTable[3] = Math.max(dimensionsForDeltaTable[3], dimensionsOfCovTable[3]);
        }

        return new NestedIntegerArray<RecalDatum>(dimensionsForDeltaTable);
    }

    protected static List<Object> generateValuesFromKeys(final int[] keys, final Covariate[] covariates, final Map<Covariate, String> covariateNameMap) {
        final List<Object> values = new ArrayList<Object>(4);
        values.add(covariates[RecalibrationTables.TableType.READ_GROUP_TABLE.ordinal()].formatKey(keys[0]));

        final int covariateIndex = keys[1];
        final int covariateKey = keys[2];
        final Covariate covariate = covariateIndex == covariates.length ? covariates[RecalibrationTables.TableType.QUALITY_SCORE_TABLE.ordinal()] : covariates[covariateIndex];
        values.add(covariate.formatKey(covariateKey));
        values.add(covariateNameMap.get(covariate));
        values.add(EventType.eventFrom(keys[3]).prettyPrint());

        return values;
    }

    /**
     * Updates the current RecalDatum element in the delta table.
     *
     * If it doesn't have an element yet, it creates an RecalDatum element and adds it to the delta table.
     *
     * @param deltaTable the delta table
     * @param deltaKey the key to the table
     * @param recalDatum the recal datum to combine with the accuracyDatum element in the table
     */
    private static void addToDeltaTable(final NestedIntegerArray<RecalDatum> deltaTable, final int[] deltaKey, final RecalDatum recalDatum) {
        final RecalDatum deltaDatum = deltaTable.get(deltaKey); // check if we already have a RecalDatum for this key
        if (deltaDatum == null)
            // if we don't have a key yet, create a new one with the same values as the current datum
            deltaTable.put(new RecalDatum(recalDatum), deltaKey);
        else
            // if we do have a datum, combine it with this one
            deltaDatum.combine(recalDatum);
    }

    /**
     * Section of code shared between the two recalibration walkers which uses the command line arguments to adjust attributes of the read such as quals or platform string
     *
     * @param read The read to adjust
     * @param RAC  The list of shared command line arguments
     */
    public static void parsePlatformForRead(final GATKSAMRecord read, final RecalibrationArgumentCollection RAC) {
        GATKSAMReadGroupRecord readGroup = read.getReadGroup();

        if (RAC.FORCE_PLATFORM != null && (readGroup.getPlatform() == null || !readGroup.getPlatform().equals(RAC.FORCE_PLATFORM))) {
            readGroup.setPlatform(RAC.FORCE_PLATFORM);
        }

        if (readGroup.getPlatform() == null) {
            if (RAC.DEFAULT_PLATFORM != null) {
                if (!warnUserNullPlatform) {
                    Utils.warnUser("The input .bam file contains reads with no platform information. " +
                            "Defaulting to platform = " + RAC.DEFAULT_PLATFORM + ". " +
                            "First observed at read with name = " + read.getReadName());
                    warnUserNullPlatform = true;
                }
                readGroup.setPlatform(RAC.DEFAULT_PLATFORM);
            }
            else {
                throw new UserException.MalformedBAM(read, "The input .bam file contains reads with no platform information. First observed at read with name = " + read.getReadName());
            }
        }
    }

    /**
     * Parse through the color space of the read and add a new tag to the SAMRecord that says which bases are 
     * inconsistent with the color space. If there is a no call in the color space, this method returns false meaning
     * this read should be skipped
     *
     * @param strategy the strategy used for SOLID no calls
     * @param read     The SAMRecord to parse
     * @return true if this read is consistent or false if this read should be skipped
     */
    public static boolean isColorSpaceConsistent(final SOLID_NOCALL_STRATEGY strategy, final GATKSAMRecord read) {
        if (!ReadUtils.isSOLiDRead(read)) // If this is a SOLID read then we have to check if the color space is inconsistent. This is our only sign that SOLID has inserted the reference base
            return true;

        // Haven't calculated the inconsistency array yet for this read
        if (read.getAttribute(RecalUtils.COLOR_SPACE_INCONSISTENCY_TAG) == null) {
            final Object attr = read.getAttribute(RecalUtils.COLOR_SPACE_ATTRIBUTE_TAG);
            if (attr != null) {
                byte[] colorSpace;
                if (attr instanceof String)
                    colorSpace = ((String) attr).getBytes();
                else
                    throw new UserException.MalformedBAM(read, String.format("Value encoded by %s in %s isn't a string!", RecalUtils.COLOR_SPACE_ATTRIBUTE_TAG, read.getReadName()));

                final boolean badColor = hasNoCallInColorSpace(colorSpace);
                if (badColor) {
                    if (strategy == SOLID_NOCALL_STRATEGY.LEAVE_READ_UNRECALIBRATED) {
                        return false; // can't recalibrate a SOLiD read with no calls in the color space, and the user wants to skip over them
                    }
                    else if (strategy == SOLID_NOCALL_STRATEGY.PURGE_READ) {
                        read.setReadFailsVendorQualityCheckFlag(true);
                        return false;
                    }
                }

                byte[] readBases = read.getReadBases(); // Loop over the read and calculate first the inferred bases from the color and then check if it is consistent with the read
                if (read.getReadNegativeStrandFlag())
                    readBases = BaseUtils.simpleReverseComplement(read.getReadBases());

                final byte[] inconsistency = new byte[readBases.length];
                int i;
                byte prevBase = colorSpace[0]; // The sentinel
                for (i = 0; i < readBases.length; i++) {
                    final byte thisBase = getNextBaseFromColor(read, prevBase, colorSpace[i + 1]);
                    inconsistency[i] = (byte) (thisBase == readBases[i] ? 0 : 1);
                    prevBase = readBases[i];
                }
                read.setAttribute(RecalUtils.COLOR_SPACE_INCONSISTENCY_TAG, inconsistency);
            }
            else if (strategy == SOLID_NOCALL_STRATEGY.THROW_EXCEPTION) // if the strategy calls for an exception, throw it
                throw new UserException.MalformedBAM(read, "Unable to find color space information in SOLiD read. First observed at read with name = " + read.getReadName() + " Unfortunately this .bam file can not be recalibrated without color space information because of potential reference bias.");

            else
                return false; // otherwise, just skip the read
        }

        return true;
    }

    private static boolean hasNoCallInColorSpace(final byte[] colorSpace) {
        final int length = colorSpace.length;
        for (int i = 1; i < length; i++) {  // skip the sentinal
            final byte color = colorSpace[i];
            if (color != (byte) '0' && color != (byte) '1' && color != (byte) '2' && color != (byte) '3') {
                return true; // There is a bad color in this SOLiD read
            }
        }

        return false; // There aren't any color no calls in this SOLiD read
    }

    /**
     * Given the base and the color calculate the next base in the sequence
     *
     * @param read     the read
     * @param prevBase The base
     * @param color    The color
     * @return The next base in the sequence
     */
    private static byte getNextBaseFromColor(GATKSAMRecord read, final byte prevBase, final byte color) {
        switch (color) {
            case '0':
                return prevBase;
            case '1':
                return performColorOne(prevBase);
            case '2':
                return performColorTwo(prevBase);
            case '3':
                return performColorThree(prevBase);
            default:
                throw new UserException.MalformedBAM(read, "Unrecognized color space in SOLID read, color = " + (char) color +
                        " Unfortunately this bam file can not be recalibrated without full color space information because of potential reference bias.");
        }
    }

    /**
     * Check if this base is inconsistent with its color space. If it is then SOLID inserted the reference here and we should reduce the quality
     *
     * @param read   The read which contains the color space to check against
     * @param offset The offset in the read at which to check
     * @return Returns true if the base was inconsistent with the color space
     */
    public static boolean isColorSpaceConsistent(final GATKSAMRecord read, final int offset) {
        final Object attr = read.getAttribute(RecalUtils.COLOR_SPACE_INCONSISTENCY_TAG);
        if (attr != null) {
            final byte[] inconsistency = (byte[]) attr;
            // NOTE: The inconsistency array is in the direction of the read, not aligned to the reference!
            if (read.getReadNegativeStrandFlag()) { // Negative direction
                return inconsistency[inconsistency.length - offset - 1] == (byte) 0;
            }
            else { // Forward direction
                return inconsistency[offset] == (byte) 0;
            }

            // This block of code is for if you want to check both the offset and the next base for color space inconsistency
            //if( read.getReadNegativeStrandFlag() ) { // Negative direction
            //    if( offset == 0 ) {
            //        return inconsistency[0] != 0;
            //    } else {
            //        return (inconsistency[inconsistency.length - offset - 1] != 0) || (inconsistency[inconsistency.length - offset] != 0);
            //    }
            //} else { // Forward direction
            //    if( offset == inconsistency.length - 1 ) {
            //        return inconsistency[inconsistency.length - 1] != 0;
            //    } else {
            //        return (inconsistency[offset] != 0) || (inconsistency[offset + 1] != 0);
            //    }
            //}

        }
        else { // No inconsistency array, so nothing is inconsistent
            return true;
        }
    }

    /**
     * Computes all requested covariates for every offset in the given read
     * by calling covariate.getValues(..).
     *
     * It populates an array of covariate values where result[i][j] is the covariate
     * value for the ith position in the read and the jth covariate in
     * reqeustedCovariates list.
     *
     * @param read                The read for which to compute covariate values.
     * @param requestedCovariates The list of requested covariates.
     * @return a matrix with all the covariates calculated for every base in the read
     */
    public static ReadCovariates computeCovariates(final GATKSAMRecord read, final Covariate[] requestedCovariates) {
        final ReadCovariates readCovariates = new ReadCovariates(read.getReadLength(), requestedCovariates.length);
        computeCovariates(read, requestedCovariates, readCovariates);
        return readCovariates;
    }

    /**
     * Computes all requested covariates for every offset in the given read
     * by calling covariate.getValues(..).
     *
     * It populates an array of covariate values where result[i][j] is the covariate
     * value for the ith position in the read and the jth covariate in
     * reqeustedCovariates list.
     *
     * @param read                The read for which to compute covariate values.
     * @param requestedCovariates The list of requested covariates.
     * @param resultsStorage      The object to store the covariate values
     */
    public static void computeCovariates(final GATKSAMRecord read, final Covariate[] requestedCovariates, final ReadCovariates resultsStorage) {
        // Loop through the list of requested covariates and compute the values of each covariate for all positions in this read
        for (int i = 0; i < requestedCovariates.length; i++) {
            resultsStorage.setCovariateIndex(i);
            requestedCovariates[i].recordValues(read, resultsStorage);
        }
    }

    /**
     * Perform a certain transversion (A <-> C or G <-> T) on the base.
     *
     * @param base the base [AaCcGgTt]
     * @return the transversion of the base, or the input base if it's not one of the understood ones
     */
    private static byte performColorOne(byte base) {
        switch (base) {
            case 'A':
            case 'a':
                return 'C';
            case 'C':
            case 'c':
                return 'A';
            case 'G':
            case 'g':
                return 'T';
            case 'T':
            case 't':
                return 'G';
            default:
                return base;
        }
    }

    /**
     * Perform a transition (A <-> G or C <-> T) on the base.
     *
     * @param base the base [AaCcGgTt]
     * @return the transition of the base, or the input base if it's not one of the understood ones
     */
    private static byte performColorTwo(byte base) {
        switch (base) {
            case 'A':
            case 'a':
                return 'G';
            case 'C':
            case 'c':
                return 'T';
            case 'G':
            case 'g':
                return 'A';
            case 'T':
            case 't':
                return 'C';
            default:
                return base;
        }
    }

    /**
     * Return the complement (A <-> T or C <-> G) of a base.
     *
     * @param base the base [AaCcGgTt]
     * @return the complementary base, or the input base if it's not one of the understood ones
     */
    private static byte performColorThree(byte base) {
        switch (base) {
            case 'A':
            case 'a':
                return 'T';
            case 'C':
            case 'c':
                return 'G';
            case 'G':
            case 'g':
                return 'C';
            case 'T':
            case 't':
                return 'A';
            default:
                return base;
        }
    }

    /**
     * Combines the recalibration data for table1 and table2 into table1
     *
     * Note that table1 is the destination, so it is modified
     *
     * @param table1 the destination table to merge table2 into
     * @param table2 the source table to merge into table1
     */
    public static void combineTables(final NestedIntegerArray<RecalDatum> table1, final NestedIntegerArray<RecalDatum> table2) {
        if ( table1 == null ) throw new IllegalArgumentException("table1 cannot be null");
        if ( table2 == null ) throw new IllegalArgumentException("table2 cannot be null");
        if ( ! Arrays.equals(table1.getDimensions(), table2.getDimensions()))
            throw new IllegalArgumentException("Table1 " + Utils.join(",", table1.getDimensions()) + " not equal to " + Utils.join(",", table2.getDimensions()));

        for (final NestedIntegerArray.Leaf<RecalDatum> row : table2.getAllLeaves()) {
            final RecalDatum myDatum = table1.get(row.keys);

            if (myDatum == null)
                table1.put(row.value, row.keys);
            else
                myDatum.combine(row.value);
        }
    }

    /**
     * Increments the RecalDatum at the specified position in the specified table, or put a new item there
     * if there isn't already one.
     *
     * Does this in a thread-safe way WITHOUT being synchronized: relies on the behavior of NestedIntegerArray.put()
     * to return false if another thread inserts a new item at our position in the middle of our put operation.
     *
     * @param table the table that holds/will hold our item
     * @param qual qual for this event
     * @param isError error value for this event
     * @param keys location in table of our item
     */
    public static void incrementDatumOrPutIfNecessary( final NestedIntegerArray<RecalDatum> table,
                                                          final byte qual,
                                                          final double isError,
                                                          final int... keys ) {
        final RecalDatum existingDatum = table.get(keys);

        if ( existingDatum == null ) {
            // No existing item, try to put a new one
            if ( ! table.put(createDatumObject(qual, isError), keys) ) {
                // Failed to put a new item because another thread came along and put an item here first.
                // Get the newly-put item and increment it (item is guaranteed to exist at this point)
                table.get(keys).increment(1L, isError);
            }
        }
        else {
            // Easy case: already an item here, so increment it
            existingDatum.increment(1L, isError);
        }
    }

    /**
     * creates a datum object with one observation and one or zero error
     *
     * @param reportedQual  the quality score reported by the instrument for this base
     * @param isError       whether or not the observation is an error
     * @return a new RecalDatum object with the observation and the error
     */
    private static RecalDatum createDatumObject(final byte reportedQual, final double isError) {
        return new RecalDatum(1, isError, reportedQual);
    }
}
