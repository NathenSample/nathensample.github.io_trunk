def compile(f){
	println "[CMD] jade-win.bat -P --out _site  $f"
<<<<<<< HEAD
	"C:\\Users\\nathen.sample\\AppData\\Roaming\\npm\\jade.cmd -P --out _site  $f".split().execute() 	
	//"jade -P --out _site $f".split().execute()
}
 
for(def filePattern:args) {
        new File(".").eachFile() { f ->

                def fileName = f.toString()
				if (( f.toString().contains(filePattern) && f.toString().contains(".jade") ) || filePattern == "*" )
				{
					println "Compiling -> $f  "
					compile(f.toString())
					html=fileName.replace(".jade",".html")
					if(new File("_site\\$html").exists() == false){
						print "file _site\\$html does not exist ! "
						//System.exit(0)
					}else{
						print "Done! [_site/$html]" 
=======
	//"C:\\Users\\nathen.sample\\AppData\\Roaming\\npm\\jade.cmd -P --out _site  $f".split().execute() 
	"jade-win.bat -P --out _site  $f".split().execute()
	sleep(250)
}
start = new Date().getTime()
for(def filePattern:args) {

        new File(".").eachFile() { f ->

                def fileName = f.toString()
				if (( fileName.contains(filePattern) && fileName.contains(".jade") ) || (filePattern == "*" && fileName.contains(".jade")))
				{
					println "Compiling -> $f"
					compile(f.toString())
					html=fileName.replace(".jade",".html")
					if(new File("_site\\$html").exists() == false){
						println "file _site\\$html does not exist ! "
						//System.exit(0)
					}else{
						println "Done! [_site/$html]" 
>>>>>>> origin/NathensModification
					}
					
				}
        }
<<<<<<< HEAD
}
=======
}

log = new File("log.log")
logTime = log.text.toInteger()

end = new Date().getTime()
duration = end - start
println "This Build " + duration/1000 + "s"
duration += logTime
println "Total Builds " + ((duration/1000)/60) + "m"
log.write(duration.toString())
>>>>>>> origin/NathensModification
