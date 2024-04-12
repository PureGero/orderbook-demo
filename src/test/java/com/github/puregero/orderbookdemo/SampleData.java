package com.github.puregero.orderbookdemo;

/**
 * Sample I/O data snapshotted from live Binance data.
 */
public class SampleData {

    public static String SAMPLE_WEBSOCKET_EVENT = "{\"stream\":\"btcusdt@depth\",\"data\":{\"e\":\"depthUpdate\",\"E\":1712823466810,\"s\":\"BTCUSDT\",\"U\":45633130380,\"u\":45633130976,\"b\":[[\"70883.99000000\",\"6.38122000\"],[\"70883.97000000\",\"0.00000000\"],[\"70883.92000000\",\"0.07053000\"],[\"70883.81000000\",\"0.00000000\"],[\"70883.32000000\",\"0.00000000\"],[\"70882.78000000\",\"0.00000000\"],[\"70882.77000000\",\"0.00000000\"],[\"70882.76000000\",\"0.00000000\"],[\"70882.73000000\",\"0.00000000\"],[\"70882.50000000\",\"0.00067000\"],[\"70882.49000000\",\"0.00000000\"],[\"70882.32000000\",\"0.36856000\"],[\"70882.31000000\",\"0.04937000\"],[\"70882.30000000\",\"0.61424000\"],[\"70882.28000000\",\"0.28217000\"],[\"70882.03000000\",\"0.00000000\"],[\"70881.99000000\",\"0.00000000\"],[\"70881.91000000\",\"0.00000000\"],[\"70881.78000000\",\"0.00000000\"],[\"70881.63000000\",\"0.00000000\"],[\"70881.58000000\",\"0.00067000\"],[\"70881.57000000\",\"0.00000000\"],[\"70881.52000000\",\"0.00000000\"],[\"70881.45000000\",\"0.00000000\"],[\"70881.44000000\",\"0.00000000\"],[\"70881.35000000\",\"0.00000000\"],[\"70881.24000000\",\"0.00000000\"],[\"70881.05000000\",\"0.00141000\"],[\"70881.03000000\",\"0.00000000\"],[\"70880.66000000\",\"0.00067000\"],[\"70880.65000000\",\"0.00000000\"],[\"70880.46000000\",\"0.14108000\"],[\"70880.12000000\",\"0.00000000\"],[\"70880.01000000\",\"0.00000000\"],[\"70880.00000000\",\"0.07020000\"],[\"70879.99000000\",\"0.00000000\"],[\"70879.90000000\",\"0.20000000\"],[\"70879.79000000\",\"0.01461000\"],[\"70879.78000000\",\"0.00724000\"],[\"70879.76000000\",\"0.10313000\"],[\"70879.75000000\",\"0.22750000\"],[\"70879.74000000\",\"0.00067000\"],[\"70879.11000000\",\"0.25294000\"],[\"70878.82000000\",\"0.04228000\"],[\"70878.74000000\",\"0.00000000\"],[\"70878.19000000\",\"0.00000000\"],[\"70877.93000000\",\"0.00141000\"],[\"70877.92000000\",\"0.00000000\"],[\"70877.19000000\",\"0.00000000\"],[\"70876.81000000\",\"0.00000000\"],[\"70876.80000000\",\"0.02169000\"],[\"70876.23000000\",\"0.00000000\"],[\"70876.01000000\",\"0.00000000\"],[\"70875.14000000\",\"0.07691000\"],[\"70874.16000000\",\"0.00000000\"],[\"70873.67000000\",\"0.00000000\"],[\"70870.10000000\",\"0.00000000\"],[\"70869.82000000\",\"0.00020000\"],[\"70869.77000000\",\"0.00000000\"],[\"70869.65000000\",\"0.35426000\"],[\"70869.61000000\",\"0.04127000\"],[\"70868.87000000\",\"0.00000000\"],[\"70867.19000000\",\"0.00000000\"],[\"70866.07000000\",\"0.35294000\"],[\"70865.80000000\",\"0.00000000\"],[\"70865.73000000\",\"0.13865000\"],[\"70863.95000000\",\"0.35294000\"],[\"70863.34000000\",\"0.00100000\"],[\"70863.17000000\",\"0.12998000\"],[\"70862.29000000\",\"0.33884000\"],[\"70860.93000000\",\"0.68717000\"],[\"70860.09000000\",\"0.00000000\"],[\"70858.58000000\",\"0.46655000\"],[\"70857.43000000\",\"0.46588000\"],[\"70856.92000000\",\"0.00000000\"],[\"70856.72000000\",\"0.35294000\"],[\"70855.93000000\",\"0.00016000\"],[\"70855.70000000\",\"0.00000000\"],[\"70853.92000000\",\"0.00595000\"],[\"70853.61000000\",\"0.00000000\"],[\"70852.65000000\",\"0.00008000\"],[\"70849.36000000\",\"0.00000000\"],[\"70846.78000000\",\"0.00000000\"],[\"70845.60000000\",\"0.09197000\"],[\"70843.64000000\",\"0.00017000\"],[\"70843.37000000\",\"0.00000000\"],[\"70842.42000000\",\"0.77646000\"],[\"70841.45000000\",\"0.00000000\"],[\"70839.72000000\",\"0.00000000\"],[\"70837.70000000\",\"0.00000000\"],[\"70837.69000000\",\"0.28234000\"],[\"70836.00000000\",\"0.00000000\"],[\"70814.16000000\",\"0.00000000\"],[\"70813.95000000\",\"0.00000000\"],[\"70812.31000000\",\"0.02011000\"],[\"70811.25000000\",\"0.00000000\"],[\"70810.74000000\",\"0.00000000\"],[\"70809.82000000\",\"0.00000000\"],[\"70808.90000000\",\"0.00000000\"],[\"70807.98000000\",\"0.00000000\"],[\"70807.06000000\",\"0.00000000\"],[\"70806.14000000\",\"0.00000000\"],[\"70805.22000000\",\"0.00000000\"],[\"70804.35000000\",\"0.00000000\"],[\"70804.30000000\",\"0.00000000\"],[\"70803.81000000\",\"0.28248000\"],[\"70803.38000000\",\"0.00000000\"],[\"70803.21000000\",\"0.00000000\"],[\"70802.46000000\",\"0.00000000\"],[\"70801.54000000\",\"0.00000000\"],[\"70801.42000000\",\"0.16978000\"],[\"70800.62000000\",\"0.00000000\"],[\"70798.48000000\",\"0.00010000\"],[\"70790.34000000\",\"0.11752000\"],[\"70782.94000000\",\"0.14155000\"],[\"70768.68000000\",\"0.00000000\"],[\"70762.81000000\",\"0.27207000\"],[\"70744.82000000\",\"0.02808000\"],[\"70737.50000000\",\"0.00014000\"],[\"70733.70000000\",\"0.00000000\"],[\"70729.70000000\",\"0.00011000\"],[\"70720.83000000\",\"0.00000000\"],[\"70720.00000000\",\"0.00525000\"],[\"70715.32000000\",\"0.00316000\"],[\"70705.84000000\",\"0.00015000\"],[\"70700.00000000\",\"0.04552000\"],[\"70697.65000000\",\"0.00000000\"],[\"70677.02000000\",\"0.00652000\"],[\"70676.70000000\",\"0.00000000\"],[\"70670.77000000\",\"0.00011000\"],[\"70668.36000000\",\"0.00000000\"],[\"70666.66000000\",\"0.00440000\"],[\"70666.60000000\",\"0.00239000\"],[\"70666.49000000\",\"0.00012000\"],[\"70662.90000000\",\"0.00000000\"],[\"70649.15000000\",\"0.00000000\"],[\"70646.42000000\",\"0.00008000\"],[\"70622.70000000\",\"0.00047000\"],[\"70620.00000000\",\"0.00431000\"],[\"70594.15000000\",\"0.00000000\"],[\"70568.05000000\",\"0.11638000\"],[\"70529.44000000\",\"0.04177000\"],[\"70494.52000000\",\"0.04977000\"],[\"70175.16000000\",\"0.00037000\"],[\"70170.99000000\",\"0.00083000\"],[\"70142.58000000\",\"0.00000000\"],[\"70085.53000000\",\"0.00654000\"],[\"69779.95000000\",\"0.00000000\"],[\"68450.00000000\",\"0.04830000\"],[\"68000.00000000\",\"76.14916000\"],[\"65700.00000000\",\"4.09994000\"],[\"63795.59000000\",\"0.00032000\"],[\"63795.00000000\",\"0.00313000\"],[\"56707.20000000\",\"0.00012000\"],[\"56695.72000000\",\"0.00012000\"],[\"35441.99000000\",\"0.00033000\"],[\"35439.87000000\",\"0.00000000\"],[\"35434.82000000\",\"0.00000000\"],[\"33000.00000000\",\"17.50118000\"]],\"a\":[[\"70879.79000000\",\"0.00000000\"],[\"70880.00000000\",\"0.00000000\"],[\"70880.13000000\",\"0.00000000\"],[\"70880.66000000\",\"0.00000000\"],[\"70881.25000000\",\"0.00000000\"],[\"70881.36000000\",\"0.00000000\"],[\"70881.45000000\",\"0.00000000\"],[\"70881.53000000\",\"0.00000000\"],[\"70881.58000000\",\"0.00000000\"],[\"70881.79000000\",\"0.00000000\"],[\"70881.92000000\",\"0.00000000\"],[\"70882.00000000\",\"0.00000000\"],[\"70882.04000000\",\"0.00000000\"],[\"70882.31000000\",\"0.00000000\"],[\"70882.50000000\",\"0.00000000\"],[\"70883.33000000\",\"0.00000000\"],[\"70883.42000000\",\"0.00000000\"],[\"70884.00000000\",\"2.39641000\"],[\"70884.01000000\",\"0.04995000\"],[\"70884.40000000\",\"0.14108000\"],[\"70884.54000000\",\"0.28849000\"],[\"70885.84000000\",\"0.00000000\"],[\"70885.89000000\",\"0.00000000\"],[\"70885.99000000\",\"0.00000000\"],[\"70886.89000000\",\"0.00000000\"],[\"70887.09000000\",\"0.00000000\"],[\"70887.26000000\",\"0.00000000\"],[\"70887.32000000\",\"0.36000000\"],[\"70887.98000000\",\"0.00000000\"],[\"70888.47000000\",\"0.00000000\"],[\"70888.90000000\",\"0.00000000\"],[\"70890.27000000\",\"0.00000000\"],[\"70890.80000000\",\"0.07053000\"],[\"70891.64000000\",\"0.00000000\"],[\"70891.82000000\",\"0.00000000\"],[\"70891.89000000\",\"0.00000000\"],[\"70892.01000000\",\"0.00000000\"],[\"70892.10000000\",\"0.00000000\"],[\"70892.15000000\",\"0.02162000\"],[\"70892.28000000\",\"0.00000000\"],[\"70892.52000000\",\"0.00000000\"],[\"70893.51000000\",\"0.00000000\"],[\"70894.59000000\",\"0.00000000\"],[\"70895.77000000\",\"0.00000000\"],[\"70896.75000000\",\"0.00014000\"],[\"70896.80000000\",\"0.60948000\"],[\"70897.05000000\",\"0.00000000\"],[\"70897.80000000\",\"0.00000000\"],[\"70897.88000000\",\"0.00000000\"],[\"70897.89000000\",\"0.28213000\"],[\"70898.17000000\",\"0.00020000\"],[\"70899.18000000\",\"0.00000000\"],[\"70899.26000000\",\"0.04265000\"],[\"70900.87000000\",\"0.00011000\"],[\"70901.27000000\",\"0.00000000\"],[\"70902.00000000\",\"0.00000000\"],[\"70902.01000000\",\"0.00000000\"],[\"70903.34000000\",\"0.55818000\"],[\"70903.47000000\",\"0.00000000\"],[\"70904.04000000\",\"0.00000000\"],[\"70904.25000000\",\"0.00000000\"],[\"70904.98000000\",\"0.28215000\"],[\"70906.55000000\",\"0.84705000\"],[\"70910.05000000\",\"0.69676000\"],[\"70910.10000000\",\"0.10067000\"],[\"70911.85000000\",\"0.00429000\"],[\"70911.90000000\",\"0.00429000\"],[\"70912.05000000\",\"0.14106000\"],[\"70912.07000000\",\"0.28214000\"],[\"70912.94000000\",\"0.00000000\"],[\"70913.05000000\",\"0.00371000\"],[\"70914.55000000\",\"0.77646000\"],[\"70917.47000000\",\"0.00000000\"],[\"70919.67000000\",\"6.06044000\"],[\"70919.68000000\",\"0.00086000\"],[\"70922.45000000\",\"0.00000000\"],[\"70925.20000000\",\"0.00070000\"],[\"70925.27000000\",\"0.04286000\"],[\"70926.21000000\",\"0.33864000\"],[\"70926.22000000\",\"0.14107000\"],[\"70926.25000000\",\"0.56430000\"],[\"70927.03000000\",\"0.00000000\"],[\"70927.04000000\",\"0.00000000\"],[\"70929.90000000\",\"0.00000000\"],[\"70931.55000000\",\"0.21181000\"],[\"70931.56000000\",\"0.35294000\"],[\"70931.72000000\",\"0.00000000\"],[\"70932.56000000\",\"0.01171000\"],[\"70933.45000000\",\"0.28196000\"],[\"70940.40000000\",\"0.28215000\"],[\"70951.66000000\",\"0.00000000\"],[\"70953.84000000\",\"0.01171000\"],[\"70955.96000000\",\"0.00000000\"],[\"70957.25000000\",\"0.00019000\"],[\"70966.12000000\",\"0.28183000\"],[\"70970.22000000\",\"0.00000000\"],[\"70971.21000000\",\"0.00000000\"],[\"70972.84000000\",\"0.25300000\"],[\"70986.40000000\",\"0.00000000\"],[\"70988.90000000\",\"0.00023000\"],[\"71007.53000000\",\"0.28167000\"],[\"71008.81000000\",\"0.28166000\"],[\"71010.02000000\",\"0.00000000\"],[\"71090.10000000\",\"0.00000000\"],[\"71119.47000000\",\"0.10485000\"],[\"71232.59000000\",\"0.00000000\"],[\"71238.42000000\",\"0.02772000\"],[\"71460.38000000\",\"0.53250000\"],[\"71905.24000000\",\"0.00000000\"],[\"72271.94000000\",\"0.00641000\"],[\"72330.70000000\",\"0.00000000\"]]}}";

    public static String SAMPLE_DEPTH_SNAPSHOT = "{\"lastUpdateId\":45633130900,\"bids\":[[\"70883.99000000\",\"6.66032000\"],[\"70883.92000000\",\"0.07053000\"],[\"70882.50000000\",\"0.00067000\"],[\"70882.32000000\",\"0.36856000\"],[\"70882.31000000\",\"0.04937000\"],[\"70882.30000000\",\"0.61424000\"],[\"70881.58000000\",\"0.00067000\"],[\"70880.66000000\",\"0.00067000\"],[\"70880.00000000\",\"0.07020000\"],[\"70879.90000000\",\"0.20000000\"],[\"70879.79000000\",\"0.01461000\"],[\"70879.78000000\",\"0.00724000\"],[\"70879.76000000\",\"0.10313000\"],[\"70879.75000000\",\"0.22750000\"],[\"70879.74000000\",\"0.00067000\"],[\"70879.73000000\",\"0.12998000\"],[\"70879.49000000\",\"0.00141000\"],[\"70879.11000000\",\"0.25294000\"],[\"70879.10000000\",\"0.44846000\"],[\"70878.82000000\",\"0.04228000\"],[\"70878.47000000\",\"0.10000000\"],[\"70878.12000000\",\"0.42151000\"],[\"70877.90000000\",\"0.00067000\"],[\"70876.98000000\",\"0.00067000\"],[\"70876.80000000\",\"0.02169000\"],[\"70876.38000000\",\"0.00141000\"],[\"70876.23000000\",\"0.28219000\"],[\"70876.06000000\",\"0.00067000\"],[\"70876.00000000\",\"0.07020000\"],[\"70875.14000000\",\"0.07691000\"],[\"70875.13000000\",\"0.10000000\"],[\"70875.02000000\",\"0.04200000\"],[\"70874.99000000\",\"0.12998000\"],[\"70874.87000000\",\"0.07200000\"],[\"70874.46000000\",\"0.02376000\"],[\"70874.29000000\",\"0.10000000\"],[\"70874.22000000\",\"0.26174000\"],[\"70874.21000000\",\"0.43505000\"],[\"70873.77000000\",\"0.04383000\"],[\"70873.43000000\",\"0.10000000\"],[\"70873.35000000\",\"0.00008000\"],[\"70873.30000000\",\"0.00067000\"],[\"70873.29000000\",\"0.12998000\"],[\"70872.78000000\",\"0.12998000\"],[\"70872.38000000\",\"0.00067000\"],[\"70872.00000000\",\"0.07035000\"],[\"70871.98000000\",\"0.12998000\"],[\"70871.57000000\",\"0.07054000\"],[\"70871.46000000\",\"0.00067000\"],[\"70871.45000000\",\"0.12998000\"]],\"asks\":[[\"70884.00000000\",\"2.40881000\"],[\"70884.34000000\",\"0.00067000\"],[\"70884.37000000\",\"0.00009000\"],[\"70884.54000000\",\"0.28849000\"],[\"70884.61000000\",\"0.00982000\"],[\"70885.26000000\",\"0.00067000\"],[\"70885.60000000\",\"0.08000000\"],[\"70885.74000000\",\"0.00008000\"],[\"70885.82000000\",\"0.00051000\"],[\"70886.18000000\",\"0.00067000\"],[\"70886.99000000\",\"0.00114000\"],[\"70887.10000000\",\"0.00067000\"],[\"70887.23000000\",\"0.00008000\"],[\"70887.24000000\",\"0.00008000\"],[\"70887.32000000\",\"0.36000000\"],[\"70887.33000000\",\"0.35294000\"],[\"70887.45000000\",\"0.01383000\"],[\"70887.65000000\",\"0.00083000\"],[\"70888.02000000\",\"0.00067000\"],[\"70888.34000000\",\"0.00153000\"],[\"70888.35000000\",\"0.60000000\"],[\"70888.52000000\",\"0.00008000\"],[\"70888.82000000\",\"0.00705000\"],[\"70888.84000000\",\"0.00017000\"],[\"70888.88000000\",\"0.00384000\"],[\"70888.94000000\",\"0.00067000\"],[\"70889.18000000\",\"0.00019000\"],[\"70889.24000000\",\"0.00010000\"],[\"70889.29000000\",\"0.46588000\"],[\"70889.62000000\",\"0.30974000\"],[\"70889.86000000\",\"0.00067000\"],[\"70890.00000000\",\"0.00376000\"],[\"70890.09000000\",\"0.00028000\"],[\"70890.15000000\",\"0.00100000\"],[\"70890.27000000\",\"0.28214000\"],[\"70890.60000000\",\"0.00008000\"],[\"70890.62000000\",\"0.00057000\"],[\"70890.78000000\",\"0.00067000\"],[\"70890.80000000\",\"0.07053000\"],[\"70890.92000000\",\"0.01000000\"],[\"70891.04000000\",\"0.00026000\"],[\"70891.20000000\",\"0.19620000\"],[\"70891.21000000\",\"0.10172000\"],[\"70891.24000000\",\"0.01475000\"],[\"70891.30000000\",\"0.00072000\"],[\"70891.35000000\",\"0.24823000\"],[\"70891.56000000\",\"0.00024000\"],[\"70891.65000000\",\"0.04000000\"],[\"70891.66000000\",\"0.21781000\"],[\"70891.70000000\",\"0.00067000\"]]}";

}
