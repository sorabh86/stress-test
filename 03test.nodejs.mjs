import {open , appendFile} from "fs/promises";

const ONELAKH = 100000;

async function stress_test() {
	let date = new Date();
	const start = parseFloat(date.getTime()+"."+date.getMilliseconds()); 
	
	const file = await open("test-nodejs.txt", "a");

	for(let i=0; i<ONELAKH; i++)
		await appendFile(file, i+". Node module is awesome.\n");

	// autoclose, not required to close 
	// close(file);
	
	date = new Date()
	const end = parseFloat(date.getTime()+"."+date.getMilliseconds());

	console.log((end - start)+" miliseconds (JavaScript)");
}


stress_test();