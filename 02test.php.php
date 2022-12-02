<?php 

define("ONELAKH", 100000);

function stress_test() {
	$r = microtime(true)*1000;
	$fi = fopen("test-php.txt", "w");
	
	for($i = 0; $i<ONELAKH; $i++)
		fputs($fi, "\n".$i.". Iterations");

	$x = microtime(true)*1000;
	$result = $x - $r;

	echo $result." milliseconds (PHP language)";
}

stress_test();